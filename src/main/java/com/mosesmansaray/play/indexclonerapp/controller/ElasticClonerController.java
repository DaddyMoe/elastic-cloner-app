package com.mosesmansaray.play.indexclonerapp.controller;

import com.mosesmansaray.play.indexclonerapp.service.IndexClonerService;
import com.mosesmansaray.play.indexclonerapp.model.CloneProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Basic Entry point for Elastic Clone Web Application
 * <p/>
 * The class is flagged as a @RestController, meaning it’s ready for use by Spring MVC to handle web requests.
 * And @RequestMapping maps / to the index() method. When invoked from a browser or using curl on the command line,
 * the method returns pure text. That’s because @RestController combines @Controller and @ResponseBody,
 * two annotations that results in web requests returning data rather than a view.
 * <p/>
 *
 * @author moses.mansaray
 */
@Controller
@RequestMapping("/")
public class ElasticClonerController {

    private IndexClonerService service;

    @Autowired
    public ElasticClonerController(IndexClonerService service) {
        this.service = service;

    }

    @RequestMapping(method= RequestMethod.GET)
    public String home(Map<String,Object> model) {
        if (model.isEmpty()){
            CloneProperties cloneProperties = new CloneProperties();
            model.put("cloneProperties", cloneProperties);
        }
        return "home";
    }

    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView submit(CloneProperties cloneProperties) {

        try {
            service.executeIndexCloning(cloneProperties);
            cloneProperties.setSuccessMessage("Executions was successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cloneProperties.setErrorMessage("Oops something went wrong");
        }

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("cloneProperties", cloneProperties);

        return modelAndView;
    }

}
