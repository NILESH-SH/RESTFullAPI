package com.simple.crud.simple_crud.service;

import java.util.Map;
import java.util.Optional;

import com.simple.crud.simple_crud.entity.Item;

public interface ItemService {
    Item addItem(Item item);

    Optional<Item> getItemById(Long id);

    Map<Long, Item> getAllItems();

    Item updateItem(Long id, Item newItem);

    void deleteItem(Long id);
}
