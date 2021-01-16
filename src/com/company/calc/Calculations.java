package com.company.calc;


public class Calculations {

    static double calculation(double a, String dz, double b) {

        return switch (dz) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalStateException("Unexpected value: " + dz);
        };
    }
}


/*
    static double adding(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;

    }

    static double multiply(double a, double b) {
        return a * b;

    }

    static double divide(double a, double b) {
        return a / b;
    }
*/

