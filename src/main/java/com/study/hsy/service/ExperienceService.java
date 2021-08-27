package com.study.hsy.service;


import com.study.hsy.mapper.ExperienceMapper;
import com.study.hsy.model.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    ExperienceMapper expMapper;
    public ExperienceService(ExperienceMapper expMapper) {
        this.expMapper = expMapper;
    }

    public List<Experience> getExpList(){ return expMapper.getExpList();}
}
