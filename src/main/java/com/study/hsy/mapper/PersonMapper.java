package com.study.hsy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PersonMapper {
    List<Map<String, Object>> findAll(); // mapper의 id와 Interface에 메소드명이 일치해야한다.
}
