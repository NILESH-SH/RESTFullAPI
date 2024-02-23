package com.simple.crud.simple_crud.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.crud.simple_crud.entity.Item;
import com.simple.crud.simple_crud.repository.ItemRepositoryImpl;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepositoryImpl itemRepository;

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Map<Long, Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item updateItem(Long id, Item newItem) {
        return itemRepository.update(id, newItem);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
