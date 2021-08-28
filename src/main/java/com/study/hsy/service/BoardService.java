package com.study.hsy.service;

import com.study.hsy.mapper.BoardMapper;
import com.study.hsy.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    BoardMapper boardMapper;

    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> getBoardList(){
        return boardMapper.getBoardList();
    }
}
