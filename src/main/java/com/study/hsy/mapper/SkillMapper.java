package com.study.hsy.mapper;


import com.study.hsy.model.Skill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkillMapper {
    List<Skill> getSkillList();
}
