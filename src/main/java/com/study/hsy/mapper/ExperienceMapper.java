package com.study.hsy.mapper;

import com.study.hsy.model.Experience;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExperienceMapper {
    List<Experience> getExpList();
}
