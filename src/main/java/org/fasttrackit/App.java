package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Soso");
        animal.setAge(5);
        animal.setHealth(8);
        animal.setHungerLevel(6);
        animal.setMindset(7);
        animal.setAnimalFood("Pedigree");
        animal.setActivities("play");

        Adopter adopter = new Adopter();
        adopter.setName("Ana");
        adopter.setMoney(420);

        AnimalFood animalFood = new AnimalFood("pedigree");
        animalFood.setFoodname("Pedigree");
        animalFood.setPrice(20);
        animalFood.setQuantity(10);
        animalFood.setStock(25);
        animalFood.setExpirationDate (LocalDate.of(2020,10,25));

        Vet vet = new Vet();
        vet.setName("Mike");
        vet.setSpeciality("emergency");

        Activities activities = new Activities("Playball");
        activities.setName("walk");
        activities.setDuration(2);

        Animal dog = new Animal();
        dog.setName("Lala");

        Adopter rescuer = new Adopter();
        rescuer.setName("Dana");

        Vet vet1 = new Vet();
        vet1.setName("Sara");

        Adopter rescuer1= new Adopter();
        rescuer1.setName("John");
        rescuer1.feed("Purina", "Chaika");



    }
}
