package com.btcag.bootcamp;

import java.util.Scanner;

public class Spielfeld {
    public static void spielfeld() {
        Scanner scanner = new Scanner(System.in);

        // Die Variablen für die Koordinaten des Roboters werden definiert
        int zeilen = 10;
        int spalten = 12;
        int rX = 5;
        int rY = 8;

        System.out.println("Ziehe in die Schlacht!\n");

        while (true) {

            for (int Y = 1; Y <= zeilen; Y++) {
                for (int X = 1; X<= spalten; X++) {
                    if (rX == X && rY == Y) {
                        System.out.print("{O}");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
            }

            // Die Position des Roboters wird ausgegeben
            String feld = rX + ":" + rY;
            System.out.println();
            System.out.println("Dein Roboter befindet sich auf Feld: " + feld);

            System.out.println("Gib an, wohin du fahren willst. (w, a, s, d, q)");
            char zug = scanner.nextLine().charAt(0);


            switch (zug) {
                case 'w':
                    if (rY > 1) {
                        rY--;
                    } else {
                        System.out.println("Du kannst nicht weiter nach oben.");
                    }
                    break;
                case 's':
                    if (rY < zeilen) {
                        rY++;
                    } else {
                        System.out.println("Du kannst nicht weiter nach unten.");
                    }
                    break;
                case 'a':
                    if (rX > 1) {
                        rX--;
                    } else {
                        System.out.println("Du kannst nicht weiter nach links.");
                    }
                    break;
                case 'd':
                    if (rX < spalten) {
                        rX++;
                    } else {
                        System.out.println("Du kannst nicht weiter nach rechts.");
                    }
                    break;
                case 'q' :
                    System.out.println("Spiel beenden.");
                    System.exit(0);
                default:
                    System.out.println("Ungültige Angabe.");
            }
            System.out.println();
        }
    }
}