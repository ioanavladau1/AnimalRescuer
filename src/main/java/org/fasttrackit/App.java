package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Soso";
        animal.age = 5;
        animal.health = 8;
        animal.hungerLevel = 6;
        animal.mindset = 7;
        animal.animalFood = "Pedigree";
        animal.activities = "play";

        Adopter adopter = new Adopter();
        adopter.name = "Ana";
        adopter.money = 420;

        AnimalFood animalFood = new AnimalFood();
        animalFood.foodname = "Pedigree";
        animalFood.price = 20;
        animalFood.quantity = 10;
        animalFood.stock = 25;
        animalFood.expirationDate = LocalDate.of(2020,10,25);


    }
}
