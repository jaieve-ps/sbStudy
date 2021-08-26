package com.study.hsy.mapper;

import com.study.hsy.model.Link;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LinkMapper {
    List<Link> getLinkList();
}
