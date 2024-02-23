package com.simple.crud.simple_crud.repository;

import java.util.Map;
import java.util.Optional;

import com.simple.crud.simple_crud.entity.Item;

public interface ItemRepository {
    Item save(Item item);
    
    Optional<Item> findById(Long id);
    
    Map<Long, Item> findAll();
    
    Item update(Long id, Item newItem);
    
    void deleteById(Long id);
}
