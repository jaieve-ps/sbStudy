package com.study.hsy.service;

import com.study.hsy.mapper.PersonMapper;
import com.study.hsy.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    PersonMapper personMapper;

    public PersonService(PersonMapper personMapper){
        this.personMapper = personMapper;
    }

    public List<Person> findAll() {
        return personMapper.findAll();
    }

    public Person getPerson(Long id) {
        return personMapper.getPerson(id);
    }
}
