package com.example.day4_homework2.entities.concretes;

import com.example.day4_homework2.entities.abstracts.Entity;

public class Campaign implements Entity {
    private int id;
    private String name;
    private String campaignCode;
    private double discount;

    public Campaign(int id, String name, String campaignCode, double discount) {
        this.id = id;
        this.name = name;
        this.campaignCode = campaignCode;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
