package com.study.hsy.service;

import com.study.hsy.mapper.PersonMapper;
import com.study.hsy.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Person findAll() {
        return personMapper.findAll();
    }
}
