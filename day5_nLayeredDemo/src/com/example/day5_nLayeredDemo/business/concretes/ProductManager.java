package com.example.day5_nLayeredDemo.business.concretes;

import com.example.day5_nLayeredDemo.business.abstracts.ProductService;
import com.example.day5_nLayeredDemo.dataAccess.abstracts.ProductDao;
import com.example.day5_nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }
        this.productDao.add(product);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
