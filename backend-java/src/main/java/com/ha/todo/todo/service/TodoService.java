package com.ha.todo.todo.service;

import java.util.List;

import com.ha.todo.todo.domain.Todo;
import com.ha.todo.todo.repository.ITodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private ITodoRepository todoRepository;
    
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
}
