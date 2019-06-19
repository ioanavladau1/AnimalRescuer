package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal ();
        animal.name= "Soso";
        animal.age= 5;
        animal.health 8;
        animal.hungerLevel= 6;
        animal.mindset= 7;
        animal.animalFood= "Pedigree";
        animal.activities= "play";

        Adopter adopter= new Adopter();
        adopter.name= "Ana";
        adopter.money= 420;


    }
}
