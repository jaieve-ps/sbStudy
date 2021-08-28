package com.study.hsy.mapper;

import com.study.hsy.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> getBoardList();
    Board getBoardOne(Long id);
    int writeBoard(Board board);
}
