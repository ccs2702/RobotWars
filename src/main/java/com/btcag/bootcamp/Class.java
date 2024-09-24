package com.btcag.bootcamp;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Geben Sie Ihren Namen an.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int zahl = 0;

        while (zahl < 1) {
            zahl = zahl + 1;

            System.out.println("   __\n" +
                    "|\"\"\"\\-=\n" +
                    "(____) \n");

            Thread.sleep(600);

            System.out.println("   _.\n" +
                    " |\"\"\"\\-=\n" +
                    " (____)\n");

            Thread.sleep(600);

            System.out.println("     /_\n" +
                    "   |\"\"\"\\-=\n" +
                    "   (____)\n");

            Thread.sleep(600);

            System.out.println("     \\;\":-\n" +
                    "     |\"\"\"\\-=\n" +
                    "     (____)\n");

            Thread.sleep(600);

            System.out.println("      -;\":-\n" +
                    "      \\| |\n" +
                    "      |\"\"\"\\-=\n" +
                    "      (____)\n");

            Thread.sleep(600);

            System.out.println("        _.-._\n" +
                    "         ^-^     __,-.\n" +
                    "        \\|_|    ( .`-')\n" +
                    "        |\"\"\"\\-=(_ (_,_)\n" +
                    "        (____)   `--'\n");

            Thread.sleep(600);

            System.out.println("        _.-._\n" +
                    "         ^-^     __,-.\n" +
                    "        \\|_|    ( .`-')_.o\n" +
                    "        |\"\"\"\\-=(_ (_,_)\n" +
                    "        (____)   `--'\n");

            Thread.sleep(600);

            System.out.println("        _.-._\n" +
                    "         ^-^     ..,-.      _.--\"\"\"\"o\n" +
                    "        \\|_|    : .`-';_.-\"\n" +
                    "        |\"\"\"\\-=:. (.,.)\n" +
                    "        (____)   `:-'\n");

            Thread.sleep(600);

            System.out.println("        _.-._\n" +
                    "         ^-^     .. .       _.--\"\"\"\"--.\n" +
                    "        \\|_|    : . : ; . \"             \"-.\n" +
                    "        |\"\"\"\\-=:. :.,.;                    `.\n" +
                    "        (____)   `.:'                        o");
        }

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
