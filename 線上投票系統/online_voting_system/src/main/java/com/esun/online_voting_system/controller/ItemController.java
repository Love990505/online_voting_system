package com.esun.online_voting_system.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.esun.online_voting_system.entity.Item;
import com.esun.online_voting_system.repository.ItemRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class ItemController {

    @Autowired
    private ItemRepository ItemRepository;

    @GetMapping("/items")
    public List<Item> fetchItem() {
        return ItemRepository.findAll();
    }
}
