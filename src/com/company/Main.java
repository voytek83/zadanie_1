package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> imiona = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj swoje imię");
            imiona.add(scanner.next());
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("Witaj " + imiona.get(j));
        }
    }
}
