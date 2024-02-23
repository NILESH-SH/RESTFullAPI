package com.simple.crud.simple_crud.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.simple.crud.simple_crud.entity.Item;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private Map<Long, Item> itemMap = new HashMap<>();
    private Long nextId = 1L;

    public Item save(Item item) {
        item.setId(nextId);
        itemMap.put(nextId, item);
        nextId++;
        return item;
    }

    public Optional<Item> findById(Long id) {
        return Optional.ofNullable(itemMap.get(id));
    }

    public Map<Long, Item> findAll() {
        System.out.println(itemMap);
        return itemMap;
    }

    public Item update(Long id, Item newItem) {
        if (itemMap.containsKey(id)) {
            newItem.setId(id);
            itemMap.put(id, newItem);
            return newItem;
        }
        return null; // Or throw an exception
    }

    public void deleteById(Long id) {
        itemMap.remove(id);
    }
}
