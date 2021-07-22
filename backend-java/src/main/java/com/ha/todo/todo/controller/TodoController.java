package com.ha.todo.todo.controller;


import java.util.List;

import com.ha.todo.todo.domain.Todo;
import com.ha.todo.todo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://localhost:3000")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/api/todoItems")
    public ResponseEntity<?> findAll() {
        List<Todo> itemList = todoService.findAll();
        return ResponseEntity.ok(itemList);
    }
}
