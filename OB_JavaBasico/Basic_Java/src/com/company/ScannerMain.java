package com.company;

import java.util.Scanner; //Needed package to use scanner and get input from the user;

public class ScannerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name");

        String name = scanner.nextLine();

        System.out.println("Your name is " + name);
    }
}
