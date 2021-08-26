package com.study.hsy.mapper;

import com.study.hsy.model.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    List<Person> findAll(); // mapper의 id와 Interface에 메소드명이 일치해야한다.

    Person getPerson(Long id);
}
