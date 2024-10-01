package com.btcag.bootcamp;

import java.util.Scanner;

public class Spielfeld {
    public static void spielfeld() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String feld;

        boolean einsIstDran = true;

        // Die Variablen für die Koordinaten des Roboters werden definiert
        int zeilen = 10;
        int spalten = 12;
        int rX = 1;
        int rY = 1;
        int rX1 = 12;
        int rY1 = 10;

        System.out.println("Ziehe in die Schlacht!");
        System.out.println("w = up, s = down, a = left, d = right, r = rest, q = quit \n");
        System.out.println("Spieler 1 ist am Zug. \n");

        while (true) {

            for (int Y = 1; Y <= zeilen; Y++) {
                for (int X = 1; X <= spalten; X++) {
                    if (rX == X && rY == Y) {
                        System.out.print("{O}");
                    } else if (rY1 == Y && rX1 == X) {
                        System.out.print("{X}");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
            }

            // Die Position des Roboters wird ausgegeben
            if (einsIstDran) {
                feld = rX + ":" + rY;
                System.out.println();
                System.out.println("Dein Roboter befindet sich auf Feld: " + feld);
            } else {
                feld = rX1 + ":" + rY1;
                System.out.println();
                System.out.println("Dein Roboter befindet sich auf Feld: " + feld);
            }

            System.out.println("Gib an, wohin du fahren willst. (w, a, s, d, r, q)");
            char zug = scanner.nextLine().charAt(0);


            if (einsIstDran) {
                System.out.println("Spieler 2 ist am Zug.");

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
                    case 'r':
                        break;
                    case 'q':
                        System.out.println("Spiel beenden.");
                        System.exit(0);
                    default:
                        System.out.println("Ungültige Angabe.");
                }
                System.out.println();

            } else {
                System.out.println("Spieler 1 ist am Zug.");

                switch (zug) {
                    case 'w':
                        if (rY1 > 1) {
                            rY1--;
                        } else {
                            System.out.println("Du kannst nicht weiter nach oben.");
                        }
                        break;
                    case 's':
                        if (rY1 < zeilen) {
                            rY1++;
                        } else {
                            System.out.println("Du kannst nicht weiter nach unten.");
                        }
                        break;
                    case 'a':
                        if (rX1 > 1) {
                            rX1--;
                        } else {
                            System.out.println("Du kannst nicht weiter nach links.");
                        }
                        break;
                    case 'd':
                        if (rX1 < spalten) {
                            rX1++;
                        } else {
                            System.out.println("Du kannst nicht weiter nach rechts.");
                        }
                        break;
                    case 'r':
                        break;
                    case 'q':
                        System.out.println("Spiel beenden.");
                        System.exit(0);
                    default:
                        System.out.println("Ungültige Angabe.");
                }
                System.out.println();
            }
            einsIstDran = !einsIstDran;

            if (einsIstDran && rX == rX1 && rY == rY1) {
                Thread.sleep(500);
                System.out.println("Spieler 2 hat gewonnen! Herzlichen Glückwunsch!");
                System.exit(0);
            } else if (!einsIstDran && rX == rX1 && rY == rY1) {
                Thread.sleep(500);
                System.out.println("Spieler 1 hat gewonnen! Herzlichen Glückwunsch!");
                System.exit(0);
            }
        }
    }
}
