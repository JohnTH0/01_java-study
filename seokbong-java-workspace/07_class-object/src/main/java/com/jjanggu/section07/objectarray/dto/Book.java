package com.jjanggu.section07.objectarray.dto;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int price;

    public Book() {}

    public Book(String title, String author, String publisher, int price){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation(){
        return "Title: " + title + ", Author: " + author + ", Publisher: " + publisher + ", Price: " + price;
    }
}
