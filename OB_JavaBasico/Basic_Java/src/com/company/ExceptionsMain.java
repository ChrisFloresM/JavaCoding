package com.company;

public class ExceptionsMain {
    public static void main(String[] args) {
        try {
            int result = 5/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fin");
        }
    }
}
