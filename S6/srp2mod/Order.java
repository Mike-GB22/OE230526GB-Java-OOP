package ru.geekbrains.lesson6.srp2mod;

import java.util.Scanner;


public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public void saveToJson() {
        OrderSave.saveToJson(this);
    }
}
