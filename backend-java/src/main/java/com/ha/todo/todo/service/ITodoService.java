package com.ha.todo.todo.service;

import java.util.List;
import java.util.Optional;

import com.ha.todo.todo.domain.Todo;

public interface ITodoService {
    List<Todo> findAll();
    
    Optional<Todo> findById(Long id);

    Todo save(Todo todo);

    Todo update(Todo todo);
    
    void delete(Long id);

    
}
