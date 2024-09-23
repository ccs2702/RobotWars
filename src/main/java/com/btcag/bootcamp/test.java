package com.btcag.bootcamp;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Namen an: ");
        String name = scanner.nextLine();

        System.out.println(name);


        int y = 0;

        while (y < 10) {
            int x = 0;

            while (x < 12) {
                System.out.print("[ ]");
                x++;
            }
            System.out.println();
            y++;
        }
        String feld = y +":";
        System.out.println();
        System.out.println("Dein Roboter befindet sich auf Feld: " + feld);
    }
}