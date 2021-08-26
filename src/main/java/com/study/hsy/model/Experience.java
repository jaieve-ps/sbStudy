package com.study.hsy.model;

public class Experience {
    private String title;
    private String date;
    private String info;
    private String content;

    public Experience() {
    }

    public Experience(String title, String date, String info, String content) {
        this.title = title;
        this.date = date;
        this.info = info;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
