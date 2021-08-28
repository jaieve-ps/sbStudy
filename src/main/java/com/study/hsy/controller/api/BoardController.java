package com.study.hsy.controller.api;

import com.study.hsy.model.Board;
import com.study.hsy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/board")
@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("")
    public List<Board> getBoardList(Model model) {
//    public String getBoardList(Model model) {
        List<Board> postList = boardService.getBoardList();
        model.addAttribute("postList", postList);
        return postList;
//        return "board/list";
    }

    @GetMapping("/{id}")
    public String getBoardOne(@PathVariable(name="id") Long board_seq, Model model) {
        Board board = boardService.getBoardOne(board_seq);
        model.addAttribute("post", board);
        return "board/detail";
    }

    @PostMapping
    public String write(Board board) {
        boardService.writeBoard(board);
        return "redirect:/board";
    }

    @PutMapping()
    public @ResponseBody ResponseEntity<String> update(Board board) {
        boardService.updateBoard(board);
        return new ResponseEntity<String> ("PUT Response", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody ResponseEntity<String> delete(@PathVariable(name="id") Long id){
        boardService.deleteBoard(id);
        return new ResponseEntity<String> ("DELETE Response", HttpStatus.OK);
    }

}
