package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie den Namen für Ihren Roboter ein:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Herzlich Willkommen zu RobotWars!" + "\n");
        System.out.println("Ein Spiel in dem Roboter sich beweisen müssen.");
        System.out.println("Nur einer kann Gewinnen!" + "\n");

        System.out.println("[R][O][B][O][T]                     [W][A][R][S]" + "\n");

        System.out.println("[ ][A][B][C][D][E][F][G][H][I][J][K][L][M][N][O]");
        System.out.println("[0][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[1][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[2][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[3][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[4][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[5][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[6][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[7][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[8][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[9][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]" + "\n");
        System.out.println("Ihr Roboter heißt: " + name + "\n");
        System.out.println("Dein Roboter befindet sich auf dem Feld A:0");
    }
}