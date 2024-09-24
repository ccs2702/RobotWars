package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Der Name wird abgefragt
        System.out.println("Bitte geben Sie Ihren Namen ein:");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();

        //Der Name des Roboters wird abgefragt
        System.out.println("Bitte geben Sie den Namen für Ihren Roboter ein:");
        String name = scanner.nextLine();

        //Es wird ein Ladebildschirm initialisiert, mit Verzögerung
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

        // Der Spieler wird begrüßt und in das Spiel eingeleitet
        System.out.println("Herzlich Willkommen zu RobotWars " + name1 + "!\n");
        System.out.println("Ein Spiel in dem Roboter sich beweisen müssen.");
        System.out.println("Nur einer kann Gewinnen!" + "\n");

        // Die Ansicht erscheint verzögert
        Thread.sleep(1000);

        // Die Datei Skin.java wird mit der Maindatei verknüpft
        Skin.skinAuswahl();

        Thread.sleep(1000);

        // Die Überschirft wird angezeigt
        System.out.println("[R][O][B][O][T]         [W][A][R][S]" + "\n");

        Thread.sleep(500);

        // Das Spielfeld für RobotWars wird ausgegeben und anschließend wir der Name des Roboters ausgegeben und die Position auf dem Feld
        Spielfeld.spielfeld();
    }
}