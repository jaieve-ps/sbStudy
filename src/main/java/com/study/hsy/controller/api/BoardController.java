package com.study.hsy.controller.api;

import com.study.hsy.model.Board;
import com.study.hsy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/board")
@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("")
    public List<Board> getBoardList() { return boardService.getBoardList();}

    @GetMapping("/{id}")
    public Board getBoardOne(@PathVariable(name="id") Long board_seq) { return boardService.getBoardOne(board_seq);}


}
