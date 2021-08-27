package com.study.hsy.service;

import com.study.hsy.mapper.PersonMapper;
import com.study.hsy.mapper.SkillMapper;
import com.study.hsy.model.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    SkillMapper skillMapper;

    public SkillService(SkillMapper skillMapper){
        this.skillMapper = skillMapper;
    }

    public List<Skill> getSkillList() { return skillMapper.getSkillList();}

}
