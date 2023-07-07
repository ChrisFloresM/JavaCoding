package com.company;

import java.util.Arrays;

public class StringMain {

    public static void main(String[] args) {
        // String Class

        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            subsString(1,5)
            trim()
            equals("")
            compareTo("")
         */

        String myString = "Whats up!";

        System.out.println(myString.length());
        System.out.println(myString.substring(1, 4));


        //Arrays
        int[] myArray = new int[10];
        int[] myArray2 = new int[4];

        System.out.println(myArray[0]);
        myArray2[0] = 7;

        myArray[1] = 98;
        System.out.println(myArray[1]);

        for(int i:myArray2){
            System.out.println(i);
        }

        Arrays.sort(myArray);
        int result = Arrays.binarySearch(myArray, 3);
    }
}
