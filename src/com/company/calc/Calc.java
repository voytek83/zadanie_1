package com.company.calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator");
        System.out.println("Podaj pierwszą liczbę:");
        double pierwsza = scanner.nextDouble();

        System.out.println("wpisz znak działania");
        String dzialanie = scanner.next();

        System.out.println("Podaj drugą liczbę:");
        double druga = scanner.nextDouble();

        System.out.print("Wynik:");
        System.out.println(Calculations.calculation(pierwsza, dzialanie, druga));

    }
}

