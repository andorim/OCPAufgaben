package de.andorim.OCP.main.ClassDesign;


import java.io.IOException;

import static de.andorim.OCP.main.Main.eingabe;

public class ClassDesign {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben Class Design ###");
            System.out.println("1. Interfaces - Comparable");
            System.out.println("2. Interfaces - String Transform");
            System.out.println("99. Zurück");
            System.out.println("##########################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.OCP.main.ClassDesign.InterfacesComparable.Aufgaben.menu();
                        break;
                    case 2:
                        de.andorim.OCP.main.ClassDesign.InterfaceStringTransform.Aufgaben.menu();
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
