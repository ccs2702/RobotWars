package com.btcag.bootcamp;

public class Spielfeld {
    public static void spielfeld() {

        // Die Variablen für die Koordinaten des Roboters werden definiert
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
                while (!playerP) {
                    System.out.print("[ ]");
                    X++;
                    playerP = true;
                }
                playerP = false;
            }
            System.out.println();
            Y++;
        }

        // Die Position des Roboters wird ausgegeben
        String feld = rX + ":" + rY;
        System.out.println();
        System.out.println("Dein Roboter befindet sich auf Feld: " + feld);
    }
}