package com.company.calc;

import java.util.Locale;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        double wynik = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator");
        System.out.println("Podaj pierwszą liczbę:");
        double pierwsza = scanner.nextDouble();
        System.out.println("wpisz znak działania");
        String dzialanie = scanner.next();
        System.out.println("Podaj drugą liczbę:");
        double druga = scanner.nextDouble();
        System.out.print("Wynik:");


/*        switch (dzialanie.toLowerCase(Locale.ROOT)) {
            case "+":
                wynik = Calculations.adding(pierwsza, druga);
            case "-":
                wynik = Calculations.subtract(pierwsza, druga);
            case "*":
                wynik = Calculations.multiply(pierwsza, druga);
            case "/":
                wynik = Calculations.divide(pierwsza, druga);
                break;
            default:
                System.out.println(" nie może być pokazany - wprowadzono nieprawidłowy znak działania");
        }
*/
        //wynik = Calculations.calculation(pierwsza,dzialanie,druga);
        System.out.println(Calculations.calculation(pierwsza,dzialanie,druga));

    }
}

