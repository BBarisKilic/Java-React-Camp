package com.example.day4_homework2.entities.concretes;

import com.example.day4_homework2.entities.abstracts.Entity;

public class Game implements Entity {
    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;

    public Game(int id, int categoryId, String name, double unitPrice) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
