package com.ha.todo.todo.service;

import java.util.List;
import java.util.Optional;

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

    public Todo update(Long id, Todo todo) {
        Optional<Todo> todoOptional = todoRepository.findAll().stream().filter(t -> t.getId().equals(id)).findAny();
        if (todoOptional.isPresent()) {
            Todo todoItem = todoOptional.get();
            todoItem.setIsDone(todo.getIsDone());
            return todoItem;
        }
        return null;
    }
}