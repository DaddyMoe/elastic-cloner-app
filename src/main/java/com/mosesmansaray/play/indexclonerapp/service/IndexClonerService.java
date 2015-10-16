package com.mosesmansaray.play.indexclonerapp.service;

import com.mosesmansaray.play.indexclonerapp.model.CloneProperties;
import com.roncia.elasticsearch.application.IndexCloner;
import com.roncia.elasticsearch.index.IndexRef;
import com.roncia.elasticsearch.tools.com.roncia.elasticsearch.util.CommandLineUtil;
import org.apache.commons.cli.ParseException;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 *  Service; responsible for linking this Elastic cloner app to Elasticsearch index cloner
 *  <br>
 *  Builds given params and hands-over responsibilities.
 *
 * @author moses.mansaray
 */
@Service
public class IndexClonerService {

    private IndexRef sourceRef;
    private IndexRef destinationRef;

    public void executeIndexCloning(CloneProperties cloneProperties) throws IOException, InterruptedException, ParseException {
        String srcHostName = cloneProperties.getSrcHostName();
        String srcHostUserName = cloneProperties.getSrcHostUserName();
        String srcHostPassword = cloneProperties.getSrcHostPassword();
        String srcIndexName = cloneProperties.getSrcIndexName();
        sourceRef = new IndexRef(srcHostName, srcHostUserName, srcHostPassword, srcIndexName);

        String dstIndexName = cloneProperties.getDstIndexName();
        String dstHostUserName = cloneProperties.getDstHostUserName();
        String dstHostPassword = cloneProperties.getDstHostPassword();
        String dstHostName = cloneProperties.getDstHostName();
        destinationRef = new IndexRef(dstHostName, dstHostUserName, dstHostPassword, dstIndexName);

        String replicas = cloneProperties.getDstIndexNumberOfReplicas();
        String shards = cloneProperties.getDstIndexNumberOfShards();
        final String[] args = CommandLineUtil.buildCloneArguments(sourceRef, destinationRef, replicas, shards);
        IndexCloner.main(args);
    }
}