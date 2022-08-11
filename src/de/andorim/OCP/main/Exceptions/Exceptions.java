package de.andorim.OCP.main.Exceptions;


import java.io.IOException;

import static de.andorim.OCP.main.Main.eingabe;

public class Exceptions {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben Exceptions ###");
            System.out.println("1. ArrayListPositive");
            System.out.println("99. Zurück");
            System.out.println("##########################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.OCP.main.Exceptions.ArrayListPositive.Aufgaben.menu();
                        break;
                    case 99:
                        weiter = false;
                        break;
                    default:
                        System.out.println("Fehler bei der Eingabe!");
                }
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Fehler bei der Eingabe!");
            }

        }
    }


}
