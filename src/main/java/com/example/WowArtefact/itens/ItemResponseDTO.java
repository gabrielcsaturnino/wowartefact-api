package com.example.WowArtefact.itens;

public record ItemResponseDTO(Long id, String title, String description, String image, Integer price) {


    public ItemResponseDTO(Item item) {
        this(item.getId(), item.getTitle(), item.getDescription(), item.getImage(), item.getPrice());
    }
   
}
