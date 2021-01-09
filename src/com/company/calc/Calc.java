package com.company.calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        double wynik = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalkulator");
        System.out.println("Podaj pierwszą liczbę:");
        double pierwsza = scanner.nextDouble();
        System.out.println("wybierz działanie: 1.+ 2.- 3.* 4./ ");
        int dzialanie = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        double druga  = scanner.nextDouble();
        System.out.print("Wynik:");

        switch(dzialanie) {
            case 1:
                wynik = pierwsza + druga;
                break;
            case 2:
                wynik = pierwsza - druga;
                break;
            case 3:
                wynik = pierwsza * druga;
                break;
            case 4:
                if (druga == 0)
                    System.out.println("Nie można dzielić przez zero");
                else
                    wynik = pierwsza / druga;
                break;
            default:
                System.out.println("nie wybrano poprawnie działania");
                break;
        }
                System.out.println(wynik);


    }
}
