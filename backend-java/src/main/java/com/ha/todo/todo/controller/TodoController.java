package com.ha.todo.todo.controller;

import java.util.List;

import com.ha.todo.todo.domain.Todo;
import com.ha.todo.todo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todoItems")
    public ResponseEntity<?> findAll() {
        List<Todo> itemList = todoService.findAll();
        return ResponseEntity.ok(itemList);
    }

    @GetMapping("/todoItems/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        Todo item = todoService.findById(id).get();
        return ResponseEntity.ok(item);
    }
    
    @PutMapping("/todoItems/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Todo todo) {
        Todo selectedItem = todoService.findById(id).get();
        selectedItem.setIsDone(todo.getIsDone());
        Todo updatedItem = todoService.update(selectedItem);
        return ResponseEntity.ok(updatedItem);         
    }
}
