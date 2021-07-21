package com.ha.todo.todo.repository;

import java.util.ArrayList;
import java.util.List;

import com.ha.todo.todo.domain.Item;

import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
    //For information in memory - Temporarily
    private List<Item> itemList = new ArrayList<>();
    private long lastId = 0;


    public List<Item> findAll() {
        if(itemList.isEmpty()) {
            lastId++;
            itemList.add(new Item(lastId, "First Item", false));
            lastId++;
            itemList.add(new Item(lastId, "Second Item", false));
            lastId++;
            itemList.add(new Item(lastId, "Third Item", false));
        }
        return itemList;
    }

}
