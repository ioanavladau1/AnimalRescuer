package org.fasttrackit;

public class DogFood extends AnimalFood {

    String colour;

    public DogFood(String foodname) {
        super(foodname);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }


}
