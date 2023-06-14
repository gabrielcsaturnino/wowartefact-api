package com.example.WowArtefact.itens;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "itens")
@Entity(name = "itens")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
    private String description;

    public  Item(ItemRequestDTO data){
            this.image = data.image();
            this.description = data.description();
            this.title = data.title();
            this.price = data.price();
    }
}
