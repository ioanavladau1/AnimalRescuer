package org.fasttrackit;

public class Animal {

    String name;
    double age;
    double health;
    double hungerLevel;
    double mindset;
    String animalFood;
    String activities;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public double getMindset() {
        return mindset;
    }

    public void setMindset(double mindset) {
        this.mindset = mindset;
    }

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }



    public void animalmindset(double a){

       double b = getHealth();
       double c = getHungerLevel();
       if (b + c>10)
           System.out.println( "Animal is happy! ");

    }

}
