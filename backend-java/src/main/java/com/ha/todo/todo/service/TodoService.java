package com.ha.todo.todo.service;

import java.util.List;
import java.util.Optional;

import com.ha.todo.todo.domain.Todo;
import com.ha.todo.todo.repository.ITodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private ITodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public Todo save(Todo todo) {        
        return todoRepository.save(todo);
    }

    public Todo update(Todo todo) {
        return todoRepository.save(todo);
        
        /*Optional<Todo> todoOptional = todoRepository.findAll().stream().filter(t -> t.getId().equals(id)).findAny();
        if (todoOptional.isPresent()) {
            Todo todoItem = todoOptional.get();
            todoItem.setIsDone(todo.getIsDone());
            return todoItem;
        }
        return null;*/
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

   
}