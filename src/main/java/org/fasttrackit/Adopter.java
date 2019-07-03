package org.fasttrackit;

public class Adopter {



    String name;
    double money;

    public void feed(String name,String foodname ) {
        System.out.println( getName()+ " just gave some "  + foodname  +  " food to "  +  name);

    }

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



    }

