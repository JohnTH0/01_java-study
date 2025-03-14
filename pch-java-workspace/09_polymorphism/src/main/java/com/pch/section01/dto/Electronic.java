package com.pch.section01.dto;

public class Electronic {
    private String brand;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Electronic(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public Electronic() {
    }
}
