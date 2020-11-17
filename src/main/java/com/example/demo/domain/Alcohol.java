package com.example.demo.domain;


public class Alcohol {

  private String id;
  private String devSn;
  private String icNo;
  private String alcoholValue;
  private String alcoholStatus;
  private String testDateTime;
  private String devMac;
  private String picture;
  private String instime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getDevSn() {
    return devSn;
  }

  public void setDevSn(String devSn) {
    this.devSn = devSn;
  }


  public String getIcNo() {
    return icNo;
  }

  public void setIcNo(String icNo) {
    this.icNo = icNo;
  }


  public String getAlcoholValue() {
    return alcoholValue;
  }

  public void setAlcoholValue(String alcoholValue) {
    this.alcoholValue = alcoholValue;
  }


  public String getAlcoholStatus() {
    return alcoholStatus;
  }

  public void setAlcoholStatus(String alcoholStatus) {
    this.alcoholStatus = alcoholStatus;
  }


  public String getTestDateTime() {
    return testDateTime;
  }

  public void setTestDateTime(String testDateTime) {
    this.testDateTime = testDateTime;
  }


  public String getDevMac() {
    return devMac;
  }

  public void setDevMac(String devMac) {
    this.devMac = devMac;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public String getInstime() {
    return instime;
  }

  public void setInstime(String instime) {
    this.instime = instime;
  }

  @Override
  public String toString() {
    return "Alcohol{" +
            "id='" + id + '\'' +
            ", devSn='" + devSn + '\'' +
            ", icNo='" + icNo + '\'' +
            ", alcoholValue='" + alcoholValue + '\'' +
            ", alcoholStatus='" + alcoholStatus + '\'' +
            ", testDateTime='" + testDateTime + '\'' +
            ", devMac='" + devMac + '\'' +
            ", picture='" + picture + '\'' +
            ", instime='" + instime + '\'' +
            '}';
  }
}
