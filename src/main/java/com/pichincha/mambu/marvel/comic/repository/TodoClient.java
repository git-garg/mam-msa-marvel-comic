package com.pichincha.mambu.marvel.comic.repository;


import com.pichincha.mambu.marvel.comic.service.dto.TodoModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "TodoClient", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {
    @GetMapping(value = "/todos", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<TodoModel> getTodos();
}
