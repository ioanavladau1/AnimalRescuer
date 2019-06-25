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

        Vet vet = new Vet();
        vet.name = "Mike";
        vet.speciality = "emergency";

        Activities activities = new Activities();
        activities.name = "walk";

        Animal dog = new Animal();
        dog.name="Lala";

        Adopter rescuer = new Adopter();
        rescuer.name = "Dana";

        Vet vet1 = new Vet();
        vet1.name= "Sara";


    }
}
