package org.fasttrackit;

public class Game {

    Animal animal;
    Adopter rescuer;
    Vet vet1;


    public Game(Animal animal) {
        this.animal = animal;
    }
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adopter getRescuer() {
        return rescuer;
    }

    public void setRescuer(Adopter rescuer) {
        this.rescuer = rescuer;
    }

    public Vet getVet1() {
        return vet1;
    }

    public void setVet1(Vet vet1) {
        this.vet1 = vet1;
    }


    }

