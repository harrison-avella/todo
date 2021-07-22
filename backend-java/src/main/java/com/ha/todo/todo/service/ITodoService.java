package com.ha.todo.todo.service;

import java.util.List;

import com.ha.todo.todo.domain.Todo;

public interface ITodoService {
    List<Todo> findAll();
}
