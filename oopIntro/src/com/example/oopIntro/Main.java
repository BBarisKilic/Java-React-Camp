package com.example.oopIntro;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "Lenovo V14", 15000,"16 GB Ram"); //referans oluşturma

        Product product2 = new Product(2, "Lenovo V15", 16000,"32 GB Ram"); //referans oluşturma

        Product product3 = new Product(3, "Hp 5", 10000, "8 GB Ram"); //referans oluşturma

        Product[] products = {product1, product2, product3};

        //foreach
        for(Product product : products){
            System.out.println(product.name);
        }

        System.out.println(products.length);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev/Bahçe";
    }
}
