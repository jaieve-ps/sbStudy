package com.study.hsy.serviceImpl;

import com.study.hsy.mapper.PersonMapper;
import com.study.hsy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Map<String, Object>> findAll() {
        return personMapper.findAll();
    }
}
