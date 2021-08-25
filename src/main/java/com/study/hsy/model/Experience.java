package com.study.hsy.model;

public class Experience {
    private String expTitle;
    private String expDate;
    private String expInfo;
    private String expContent;

    public String getExpTitle() {
        return expTitle;
    }

    public Experience(String expTitle, String expDate, String expInfo, String expContent) {
        this.expTitle = expTitle;
        this.expDate = expDate;
        this.expInfo = expInfo;
        this.expContent = expContent;
    }

    public void setExpTitle(String expTitle) {
        this.expTitle = expTitle;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExpInfo() {
        return expInfo;
    }

    public void setExpInfo(String expInfo) {
        this.expInfo = expInfo;
    }

    public String getExpContent() {
        return expContent;
    }

    public void setExpContent(String expContent) {
        this.expContent = expContent;
    }
}
