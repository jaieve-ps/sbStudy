package com.study.hsy.controller.api;

import com.study.hsy.model.Board;
import com.study.hsy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/board")
@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/list")
    public List<Board> getBoardList() { return boardService.getBoardList();}

}
