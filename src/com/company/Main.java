package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    String[] imiona = new String[5];

	    for (int i=0;i<5;i++ ) {
            System.out.println("Podaj swoje imię");
            imiona[i] = scanner.next();
        }//Trochę szalone masz formatowanie kodu. Zobacz w intelij bodaj reformat code

	    for (int j=0;j<5;j++)//dobra praktyka to zamknięcie  kodu w górze w nawiasy {}
            System.out.println("Witaj "+imiona[j]);

    }
}
