package org.fasttrackit;

public class Activities {

    String name;
    double duration;


    public Activities(String name){
        this.name= name;}

    public Activities() {
        Activities activities;
    }
    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name; }

    public double getDuration() {
        return duration; }

    public void setDuration(double duration) {
        this.duration = duration; }

        public void playing ( String Adopter ,String Activities,String Animal){

            System.out.println( Adopter + " is " + Activities + " with " + Animal);
    }
    }