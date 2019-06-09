package com.sdacademy.core;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberRandom = new Random().nextInt(1001);

        for (int i = 1; i < 1001; i++) {

            int counter = 0;
            counter = i;

            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            if (n > numberRandom) {
                System.out.println("Numarul tastat este mai mare decat Numarul Random");
            } else {

                if (n < numberRandom) {
                    System.out.println("Numarul tastat este mai mic decat Numarul Random");

                } else {
                    System.out.println("Numarul tastat este cel ales Random " + n);
                    System.out.println("Ai reusit din " + counter + " incercari");

                }

            }

        }

    }
}

