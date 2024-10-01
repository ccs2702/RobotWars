package com.btcag.bootcamp;

import java.util.Scanner;

public class Skin {
    public static void skinAuswahl() {
        Scanner scanner = new Scanner(System.in);
        String antwort = "";
        String antwort1 = "";

        System.out.println();

        // Die auswählbaren Skins werden durch ASCII dargestellt
        System.out.println("      \\ O\n" +
                "       _\\--__\n" +
                "      /  USA \\_______\n" +
                "    __|_______|------'\n" +
                ".  //------------\\\\\n" +
                "....\\____________/\n");
        System.out.println("Damage: 15");
        System.out.println("Health: 12\n");

        System.out.println("        __________\n" +
                "*=======|__________\\_______\n" +
                "      _/       China        \\\n" +
                "      /______________________|\n" +
                "        \\()__()__()__()__()/" + "\n");
        System.out.println("Damage: 5");
        System.out.println("Health: 30 \n");

        System.out.println("       \\\n" +
                "      __\\______\n" +
                "     / Germany \\========\n" +
                " ___|___________\\_____\n" +
                "/ ___________________ \\\n" +
                "\\/ _===============_ \\/\n" +
                "  \"-===============-\"" + "\n");
        System.out.println("Damage: 10");
        System.out.println("Health: 20 \n");

        System.out.println("\n");

        // Die Abfrage wird so lange durchlaufen, bis eine der drei Optionen ausgewählt wurde
        while (!antwort.equals("1") && !antwort.equals("2") && !antwort.equals("3")) {

            // Der Spieler wird aufgefordert einen der gezeigten Skins zu wählen
            System.out.println("Wähle einen Skin Spieler 1 (1/2/3):\n");
            antwort = scanner.nextLine().trim().toLowerCase();
            System.out.println();
        }

        // Die antwort wird analysiert und wiedergegeben
        System.out.println("Sie haben Skin " + antwort + " gewählt.\n");

        switch (antwort) {
            case "1" -> System.out.println("      \\ O\n" +
                    "       _\\--__\n" +
                    "      /  USA \\_______\n" +
                    "    __|_______|------'\n" +
                    ".  //------------\\\\\n" +
                    "....\\____________/\n" +
                    "Damage: 15 \n" +
                    "Health: 12 \n");
            case "2" -> System.out.println("        __________\n" +
                    "*=======|__________\\_______\n" +
                    "      _/       China        \\\n" +
                    "      /______________________|\n" +
                    "        \\()__()__()__()__()/\n" +
                    "Damage: 5 \n" +
                    "Health: 30 \n");
            case "3" -> System.out.println("      __\\______\n" +
                    "     / Germany \\========\n" +
                    " ___|___________\\_____\n" +
                    "/ ___________________ \\\n" +
                    "\\/ _===============_ \\/\n" +
                    "  \"-===============-\"\n" +
                    "Damage: 10 \n" +
                    "Health: 20 \n");
            default -> System.out.println("Ungültige angabe.");
        }

        while (!antwort1.equals("1") && !antwort1.equals("2") && !antwort1.equals("3")) {

            // Der Spieler wird aufgefordert einen der gezeigten Skins zu wählen
            System.out.println("Wähle einen Skin Spieler 2 (1/2/3):\n");
            antwort1 = scanner.nextLine().trim().toLowerCase();
            System.out.println();
        }

        // Die antwort wird analysiert und wiedergegeben
        System.out.println("Sie haben Skin " + antwort1 + " gewählt.\n");

        switch (antwort1) {
            case "1" -> System.out.println("      \\ O\n" +
                    "       _\\--__\n" +
                    "      /  USA \\_______\n" +
                    "    __|_______|------'\n" +
                    ".  //------------\\\\\n" +
                    "....\\____________/\n" +
                    "Damage: 15 \n" +
                    "Health: 12 \n");
            case "2" -> System.out.println("        __________\n" +
                    "*=======|__________\\_______\n" +
                    "      _/       China        \\\n" +
                    "      /______________________|\n" +
                    "        \\()__()__()__()__()/\n" +
                    "Damage: 5 \n" +
                    "Health: 30 \n");
            case "3" -> System.out.println("      __\\______\n" +
                    "     / Germany \\========\n" +
                    " ___|___________\\_____\n" +
                    "/ ___________________ \\\n" +
                    "\\/ _===============_ \\/\n" +
                    "  \"-===============-\"\n" +
                    "Damage: 10 \n" +
                    "Health: 20 \n");
            default -> System.out.println("Ungültige Angabe.");
        }
    }
}
