package com.company.calc;

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

        if (dzialanie.equals("+")) {
            wynik = pierwsza + druga;
        } else {
            if (dzialanie.equals("-")) {
                wynik = pierwsza - druga;
            } else {
                if (dzialanie.equals("*")) {
                    wynik = pierwsza * druga;
                } else {
                    if (dzialanie.equals("/")) {
                        if (druga == 0) {
                            System.out.println("Nie można dzielić przez zero");
                        } else {
                            wynik = pierwsza / druga;
                        }

                    } else {
                        System.out.println(" nie może być pokazany - wprowadzono nieprawidłowy znak działania");
                    }
                }
            }

        }

        System.out.println(wynik);


    }
}

