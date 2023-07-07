package com.company;

public class Cat extends Animal {

    String name = "Neko";
    String color = "Negro";
    int age = 2;

    public Cat(){
    }

    public Cat(String specie, int numberOfLegs, boolean doesItSwim, String name){
        super(specie, numberOfLegs, doesItSwim);
        this.name = name;
    }

    @Override
    public void increaseNumberOfLegs(int numberOfLegs){
        this.numberOfLegs += numberOfLegs + 1;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", specie='" + specie + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", doesItSwim=" + doesItSwim +
                '}';
    }
}
