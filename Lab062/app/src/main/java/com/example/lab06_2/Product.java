package com.example.lab06_2;

public class Product {
    private String name;
    private String description;
    private int imgResourceId;

    public Product(String name, String description, int imgResourceId) {
        this.name = name;
        this.description = description;
        this.imgResourceId = imgResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    public void setImgResourceId(int imgResourceId) {
        this.imgResourceId = imgResourceId;
    }
}
