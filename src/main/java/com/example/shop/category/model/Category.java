package com.example.shop.category.model;

import com.example.shop.product.model.Product;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String slug;
    @OneToMany
    @JoinColumn(name = "categoryId")
    private List<Product> products;
}
