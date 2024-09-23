package com.btcag.bootcamp;

import java.util.Scanner;

public class Skin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String antwort = "";
        String antwort1 = "nein";

        System.out.println();

        System.out.println("      \\ O\n" +
                "       _\\--__\n" +
                "      /  USA \\_______\n" +
                "    __|_______|------'\n" +
                ".  //------------\\\\\n" +
                "....\\____________/\n");
        System.out.println("Damage: 15");
        System.out.println("Health: 12\n");

        System.out.println("\n");

        System.out.println("        __________\n" +
                "*=======|__________\\_______\n" +
                "      _/       China        \\\n" +
                "      /______________________|\n" +
                "        \\()__()__()__()__()/" + "\n");
        System.out.println("Damage: 5");
        System.out.println("Health: 30 \n");

        System.out.println("\n");

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

        System.out.println("Wähle einen Skin (1/2/3):\n");
        antwort = scanner.nextLine().trim().toLowerCase();
        System.out.println();

        System.out.println("Sie haben Skin " + antwort + " gewählt.");
        System.out.println(
                antwort.equals("1") ? "      \\ O\n" +
                        "       _\\--__\n" +
                        "      /  USA \\_______\n" +
                        "    __|_______|------'\n" +
                        ".  //------------\\\\\n" +
                        "....\\____________/\n" +
                        "Damage: 15 }\n" + "Health: 12 \n" :

                        antwort.equals("2") ? "        __________\n" +
                                "*=======|__________\\_______\n" +
                                "      _/       China        \\\n" +
                                "      /______________________|\n" +
                                "        \\()__()__()__()__()/\n" +
                                "Damage: 5 \n" + "Health: 30 \n" :


                                "      __\\______\n" +
                                        "     / Germany \\========\n" +
                                        " ___|___________\\_____\n" +
                                        "/ ___________________ \\\n" +
                                        "\\/ _===============_ \\/\n" +
                                        "  \"-===============-\"\n" +
                                        "Damage: 10 \n" + "Health: 20 \n"
        );
    }
}
