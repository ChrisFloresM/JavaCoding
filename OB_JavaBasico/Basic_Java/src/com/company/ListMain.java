package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> myListOfStrings = new ArrayList<>();
        List<Integer> myListOfInts = new ArrayList<>();

        myListOfStrings.add("Hello");
        myListOfStrings.add("World");
        myListOfStrings.add("How");
        myListOfStrings.add("Are");
        myListOfStrings.add("You");

        System.out.println(myListOfStrings.size());

        for(int i = 0; i < myListOfStrings.size(); i++) {
            System.out.println(myListOfStrings.get(i));
        }

        for(String word : myListOfStrings){
            System.out.println(word);
        }
    }
}
