package com.mosesmansaray.play.indexclonerapp.model;

/**
 * POJO model for passing properties between client and server
 * @author moses.mansaray
 */
public class CloneProperties {
  private String srcIndexName;
  private String srcHostName;
  private String srcHostUserName;
  private String srcHostPassword;

  private String dstIndexName;
  private String dstHostName;
  private String dstHostUserName;
  private String dstHostPassword;

  private String dstIndexNumberOfReplicas;
  private String dstIndexNumberOfShards;
  private String errorMessage;
  private String successMessage;

  public void setSrcIndexName(String srcIndexName) {
    this.srcIndexName = srcIndexName;
  }
  
  public String getSrcIndexName() {
    return srcIndexName;
  }
  
  public void setDstIndexName(String dstIndexName) {
    this.dstIndexName = dstIndexName;
  }
  
  public String getDstIndexName() {
    return dstIndexName;
  }

  public void setDstHostName(String dstHostName) {
    this.dstHostName = dstHostName;
  }

  public String getSrcHostName() {
    return srcHostName;
  }

  public void setSrcHostName(String srcHostName) {
    this.srcHostName = srcHostName;
  }

  public String getSrcHostUserName() {
    return srcHostUserName;
  }

  public void setSrcHostUserName(String srcHostUserName) {
    this.srcHostUserName = srcHostUserName;
  }

  public String getSrcHostPassword() {
    return srcHostPassword;
  }

  public void setSrcHostPassword(String srcHostPassword) {
    this.srcHostPassword = srcHostPassword;
  }

  public String getDstHostPassword() {
    return dstHostPassword;
  }

  public void setDstHostPassword(String dstHostPassword) {
    this.dstHostPassword = dstHostPassword;
  }

  public String getDstIndexNumberOfReplicas() {
    return dstIndexNumberOfReplicas;
  }

  public void setDstIndexNumberOfReplicas(String dstIndexNumberOfReplicas) {
    this.dstIndexNumberOfReplicas = dstIndexNumberOfReplicas;
  }

  public String getDstIndexNumberOfShards() {
    return dstIndexNumberOfShards;
  }

  public void setDstIndexNumberOfShards(String dstIndexNumberOfShards) {
    this.dstIndexNumberOfShards = dstIndexNumberOfShards;
  }

  public String getDstHostName() {
    return dstHostName;
  }
  
  public void setDstHostUserName(String dstHostUserName) {
    this.dstHostUserName = dstHostUserName;
  }
  
  public String getDstHostUserName() {
    return dstHostUserName;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  public String getSuccessMessage() {
    return successMessage;
  }
}