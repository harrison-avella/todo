package com.ha.todo.todo.repository;

import java.util.List;

import com.ha.todo.todo.domain.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findAll();
}
