package com.simple.crud.simple_crud.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.crud.simple_crud.entity.Item;
import com.simple.crud.simple_crud.service.ItemServiceImpl;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        Optional<Item> item = itemService.getItemById(id);
        return item.orElse(null); // Or handle differently if not present
    }

    @GetMapping
    public Map<Long, Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item newItem) {
        return itemService.updateItem(id, newItem);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }
}


// @RestController
// public class ItemController {
    
//     @GetMapping("/")
//     public String toFindAll(){
//         return "Items";
//     }
// }
