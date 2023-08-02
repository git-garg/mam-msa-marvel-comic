package com.pichincha.mambu.marvel.comic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.mambu.marvel.comic.repository.TodoClient;
import com.pichincha.mambu.marvel.comic.service.dto.TodoModel;

@lombok.AllArgsConstructor
@RestController
@RequestMapping("/todos")
public class TodoController {


    TodoClient todoClient;

    @GetMapping()
    public List<TodoModel> getTodos() {
        return todoClient.getTodos();
    }

}
