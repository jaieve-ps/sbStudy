package com.study.hsy.model;

import lombok.Data;

public class Person {
    private Long id;
    private String name;
    private String email;
    private String introduce;
    private String favQuote;
    private String religion;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getReligion() {
        return religion;
    }

    public void setFeligion(String religion) {
        this.religion = religion;
    }
}
