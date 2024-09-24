package com.btcag.bootcamp;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Namen an: ");
        String name = scanner.nextLine();

        System.out.println(name);

        int Y = 1;
        int rX = 5;
        int rY = 8;

        boolean playerP = false;

        while (Y <= 10) {
            int X = 1;

            while (X <= 12) {
                int tmpX = X;
                int tmpY = Y;

                while (rX == tmpX) {
                    while (rY == tmpY) {
                        System.out.print("{O}");
                        playerP = true;
                        X++;
                        tmpY++;
                    }
                    tmpX++;
                }
                while (playerP == false) {
                    System.out.print("[ ]");
                    X++;
                    playerP = true;
                }
                playerP = false;
            }
            System.out.println();
            Y++;
        }
        Y = 0;
        String feld = Y + ":";
        System.out.println();
        System.out.println("Dein Roboter befindet sich auf Feld: " + feld);
    }
}