package com.example.day5_nLayeredDemo.business.concretes;

import com.example.day5_nLayeredDemo.business.abstracts.ProductService;
import com.example.day5_nLayeredDemo.core.LoggerService;
import com.example.day5_nLayeredDemo.dataAccess.abstracts.ProductDao;
import com.example.day5_nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi: " + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
