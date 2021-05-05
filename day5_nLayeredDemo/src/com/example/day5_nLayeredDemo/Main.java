package com.example.day5_nLayeredDemo;

import com.example.day5_nLayeredDemo.business.concretes.ProductManager;
import com.example.day5_nLayeredDemo.dataAccess.concretes.AbcProductDao;
import com.example.day5_nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        //ToDo: Spring IoC ile çözülecek.
        ProductManager productManager = new ProductManager(new AbcProductDao());

        Product product = new Product(1, 2,"Elma", 12, 50);

        productManager.add(product);
    }
}
