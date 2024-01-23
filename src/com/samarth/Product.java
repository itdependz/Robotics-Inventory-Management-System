package com.samarth;

import java.util.*;
import java.io.*;
public class Product{
    private String name;
    private double price;
    private int quantity;
    private String link;
    private boolean status;
    public Product(){
        this.name = name;
        this.price =price;
        this.quantity = quantity;
        this.link = link;
    }

    public Product(String name, double price, int quantity, String link, boolean status){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.link = link;
    }

    public void updateName(String name){
        this.name = name;
    }

    public void updatePrice(double price){
        this.price = price;
    }

    public void updateQuantity(int quantity){
        this.quantity = quantity;
    }

    public void updateLink(String link){
        this.link = link;
    }

    public void updateStatus(boolean status){
        this.status = status;
    }
    
    public String getName() {
    	return name;
    }
    public double getPrice() {
    	return price;
    }
    public int getQuantity() {
    	return quantity;
    }
    public String getLink() {
    	return link;
    }
    public boolean getStatus() {
    	return status;
    }

}