package com.study.hsy.model;

public class Person {
    private String userName;
    private String userEmail;
    private String introduce;
    private String favQuote;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getFavQuote() {
        return favQuote;
    }

    public void setFavQuote(String favQuote) {
        this.favQuote = favQuote;
    }
}
