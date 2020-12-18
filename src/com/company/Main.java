package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] imiona = new String[5];

        for (int i=0;i<5;i++ ) {
            System.out.println("Podaj swoje imię");
            imiona[i] = scanner.next();
        }

        for (int j=0;j<5;j++) {
            System.out.println("Witaj " + imiona[j]);
        }

    }
}