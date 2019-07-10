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



    public void feed(AnimalFood food, Animal animal) {
        System.out.println(getName() + " just gave some " + food.getFoodname() + " food to " + animal.getName());
    }

        public void playing( Activities activities , Animal animal){

            System.out.println( getName() + " is " + activities.getName() + " with " + animal.getName());


    }

    }


