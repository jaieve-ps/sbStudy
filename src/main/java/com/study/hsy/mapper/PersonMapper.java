package com.study.hsy.mapper;

import com.study.hsy.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonMapper {
    Person findAll(); // mapper의 id와 Interface에 메소드명이 일치해야한다.
}
