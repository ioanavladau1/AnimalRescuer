package org.fasttrackit;

public class Adopter {

    String name;
    double money;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }



    public void feed(String animalFood, String animal) {
        System.out.println(getName() + " just gave some " + animalFood+ " food to " + animal);

    }


    }


