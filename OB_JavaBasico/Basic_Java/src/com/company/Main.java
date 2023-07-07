package com.company;

public class Main {

    public static void main(String[] args) {
        Animal neko = new Animal("Cat", 4, false);
        neko.increaseNumberOfLegs(4);
        System.out.println(neko);

        Cat ichi = new Cat("Cat", 4, false, "Ichi");
        ichi.increaseNumberOfLegs(4);
        System.out.println(ichi);

        Animal tommy = new Cat("Cat", 4, false, "Tommy");
        tommy.increaseNumberOfLegs(3);
        System.out.println(tommy);

    }
}
