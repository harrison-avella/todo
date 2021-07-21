package com.ha.todo.todo.service;

import java.util.List;

import com.ha.todo.todo.domain.Item;
import com.ha.todo.todo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    
    public List<Item> findAll() {
        return todoRepository.findAll();
    }
}
