package com.ivanzovkic;

import java.util.Scanner;

public class TestDizala {


    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int y = 0;
        Dizalo dizalo = new Dizalo();
        System.out.println("\n\n");
        dizalo.nalaženje();
        System.out.println("\n");
        printMenu();
        while (!quit) {
            int x = sc.nextInt();

            switch (x) {
                case 0:
                    if (y < x) {
                        dizalo.zatvaranje();
                        dizalo.dizanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    } else {
                        dizalo.zatvaranje();
                        dizalo.spustanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    }
                    break;
                case 1:
                    if (y < x) {
                        dizalo.zatvaranje();
                        dizalo.dizanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    } else {
                        dizalo.zatvaranje();
                        dizalo.spustanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    }
                    break;
                case 2:
                    if (y < x) {
                        dizalo.zatvaranje();
                        dizalo.dizanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    } else {
                        dizalo.zatvaranje();
                        dizalo.spustanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    }
                    break;
                case 3:
                    if (y < x) {
                        dizalo.zatvaranje();
                        dizalo.dizanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    } else {
                        dizalo.zatvaranje();
                        dizalo.spustanje(x);
                        dizalo.nalaženje();
                        dizalo.otvaranje();
                        System.out.println("\n");
                        printMenu1();
                    }
                    break;


            }
            y = x;
        }

    }

    public static void printMenu() {
        System.out.println("Pritisni gumb za željeni kat\n\n" +
                "1. Prvi kat\n" +
                "2. Drugi kat\n" +
                "3. Treci kat");
    }

    public static void printMenu1() {
        System.out.println("Pritisni gumb za željeni kat\n\n" +
                "0. Prizemlje\n" +
                "1. Prvi kat\n" +
                "2. Drugi kat\n" +
                "3. Treci kat");
    }
}
