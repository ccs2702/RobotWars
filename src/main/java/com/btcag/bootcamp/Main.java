package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String nameSpieler1;
        String nameSpieler2;
        String nameRoboter1;
        String nameRoboter2;

        int kurz = 500;
        int mittel = 800;
        int lang = 1000;

        do {
            // Der Name des Spielers wird abgefragt
            System.out.println("Bitte geben Sie Ihren Namen ein, Spieler 1:");
            nameSpieler1 = scanner.nextLine();

            if (nameSpieler1.isEmpty() || nameSpieler1.length() > 15) {
                System.out.println("Ungültige Eingabe. Gib einen Namen an. \n");
            }
        } while (nameSpieler1.isEmpty());

        do {
            //Der Name des Roboters wird abgefragt
            System.out.println("Bitte geben Sie den Namen für Ihren Roboter ein, Spieler 1:");
            nameRoboter1 = scanner.nextLine();

            if (nameRoboter1.isEmpty() || nameRoboter1.length() > 15) {
                System.out.println("Ungültige Eingabe. Gib einen Namen an. \n");
            }
        } while (nameRoboter1.isEmpty());

        Thread.sleep(200);

        do {
            System.out.println("Bitte geben Sie Ihren Namen ein, Spieler 2:");
            nameSpieler2 = scanner.nextLine();

            if (nameSpieler2.isEmpty() || nameSpieler2.length() > 15) {
                System.out.println("Ungültige Eingabe. Gib einen Namen an. \n");
            }
        } while (nameSpieler2.isEmpty());

        do {
            //Der Name des Roboters wird abgefragt
            System.out.println("Bitte geben Sie den Namen für Ihren Roboter ein, Spieler 2:");
            nameRoboter2 = scanner.nextLine();

            if (nameRoboter2.isEmpty() || nameRoboter2.length() > 15) {
                System.out.println("Ungültige Eingabe. Gib einen Namen an. \n");
            }
        } while (nameRoboter2.isEmpty());

        System.out.println();

        //Es wird ein Ladebildschirm initialisiert, mit Verzögerung
        System.out.println("///////////////");
        Thread.sleep(mittel);
        System.out.println("Daten werden Geladen...");
        Thread.sleep(mittel);
        System.out.println("///////////////");
        Thread.sleep(mittel);
        System.out.println("Map wird initialisiert...");
        Thread.sleep(mittel);
        System.out.println("///////////////");
        Thread.sleep(mittel);
        System.out.println("Starten des Spiels...\n");
        Thread.sleep(mittel);

        // Der Spieler wird begrüßt und in das Spiel eingeleitet
        System.out.println("Herzlich Willkommen zu RobotWars " + nameSpieler1 + " und " + nameSpieler2 + "!\n");
        System.out.println("Ein Spiel in dem Roboter sich beweisen müssen.");
        System.out.println("Nur einer kann Gewinnen!" + "\n");

        // Die Ansicht erscheint verzögert
        Thread.sleep(lang);

        // Die Datei Skin.java wird mit der Hauptdatei verknüpft
        Skin.skinAuswahl();

        Thread.sleep(lang);

        // Die Überschrift wird angezeigt
        System.out.println("[R][O][B][O][T]    🤖    [W][A][R][S]" + "\n");

        Thread.sleep(kurz);

        System.out.println("Spieler 1: " + nameRoboter1 + "\n");
        System.out.println("Spieler 2: " + nameRoboter2 + "\n");

        Spielfeld.spielfeld();
    }
}