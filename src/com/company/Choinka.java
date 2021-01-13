//ww
package com.company;

import java.util.Scanner;

public class Choinka {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        int h = 0;
        int g = 0;

        while (i > 0) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            while (g < h) {
                System.out.print("**");
                g++;
            }

            System.out.println();
            i--;
            h++;
            g = 0;

        }
    }
}
