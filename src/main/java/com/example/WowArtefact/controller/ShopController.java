package com.example.WowArtefact.controller;

import com.example.WowArtefact.itens.Item;
import com.example.WowArtefact.itens.ItemRepository;
import com.example.WowArtefact.itens.ItemRequestDTO;
import com.example.WowArtefact.itens.ItemResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("itens")
public class ShopController {

    @Autowired
    private ItemRepository repository;



    //recebe uma inserção de dados do front-end
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void SaveItem(@RequestBody ItemRequestDTO data){
        Item itemData = new Item(data);
        repository.save(itemData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ItemResponseDTO> getAll(){

        List<ItemResponseDTO> itemList = repository.findAll().stream().map(ItemResponseDTO::new).toList();
        return itemList;
    }



}
