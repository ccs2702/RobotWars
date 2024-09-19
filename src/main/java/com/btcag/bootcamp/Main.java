package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Herzlich willkommen zu RobotWars!");
        System.out.println("Ein Spiel in dem Roboter sich beweisen müssen. Nur einer kann Gewinnen!");
        System.out.println("");

        System.out.println("[R][O][B][O][T]                  [W][A][R][S]");
        System.out.println("");

        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("");


        System.out.println("Bitte geben Sie den Namen für Ihren Roboter ein:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Ihr Roboter heißt: " + name);
    }
}