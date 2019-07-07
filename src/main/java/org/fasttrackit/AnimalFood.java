package org.fasttrackit;


import java.time.LocalDate;

public class AnimalFood {

    String foodname;
    double price;
    double quantity;
    LocalDate expirationDate;
    double stock;

    public AnimalFood (String foodname){
        this.foodname=foodname;
    }
    public void setStock(double stock) {
        this.stock = stock;
    }
    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getStock() {
        return stock;
    }

}
