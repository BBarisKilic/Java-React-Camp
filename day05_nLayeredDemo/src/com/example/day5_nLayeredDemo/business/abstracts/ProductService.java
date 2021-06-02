package com.example.day5_nLayeredDemo.business.abstracts;

import com.example.day5_nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
