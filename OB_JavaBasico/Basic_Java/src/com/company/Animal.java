package com.company;

public class Animal {
    //Add attributes
    String specie;
    int numberOfLegs;
    boolean doesItSwim;

    //Add constructors
    public Animal(){

    }

    //Add constructors
    public Animal(String specie, int numberOfLegs, boolean doesItSwim){
        this.specie = specie;
        this.numberOfLegs = numberOfLegs;
        this.doesItSwim = doesItSwim;
    }

    //Add methods
    public void increaseNumberOfLegs(int numberOfLegs){
        this.numberOfLegs += numberOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", doesItSwim=" + doesItSwim +
                '}';
    }

}
