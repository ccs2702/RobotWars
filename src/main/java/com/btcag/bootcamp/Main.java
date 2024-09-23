package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Bitte geben Sie Ihren Namen ein:");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();

        System.out.println("Bitte geben Sie den Namen für Ihren Roboter ein:");
        String name = scanner.nextLine();

        System.out.println("///////////////");
        Thread.sleep(800);
        System.out.println("Daten werden Geladen...");
        Thread.sleep(800);
        System.out.println("///////////////");
        Thread.sleep(800);
        System.out.println("Map wird initialisiert...");
        Thread.sleep(800);
        System.out.println("///////////////");
        Thread.sleep(800);
        System.out.println("Starten des Spiels...\n");
        Thread.sleep(800);

        System.out.println("Herzlich Willkommen zu RobotWars " + name1 + "!\n");
        System.out.println("Ein Spiel in dem Roboter sich beweisen müssen.");
        System.out.println("Nur einer kann Gewinnen!" + "\n");

        Thread.sleep(1000);

        Skin.skinAuswahl();

        Thread.sleep(1000);

        System.out.println("[R][O][B][O][T]         [W][A][R][S]" + "\n");

        Thread.sleep(500);

        System.out.println("[ ][A][B][C][D][E][F][G][H][I][J][K]");
        System.out.println("[0][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[1][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[2][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[3][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[4][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[5][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[6][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[7][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[8][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]");
        System.out.println("[9][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]" + "\n");
        System.out.println("Ihr Roboter heißt: " + name + "\n");
        System.out.println("Dein Roboter befindet sich auf dem Feld A:0");
    }
}