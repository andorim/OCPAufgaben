package de.andorim.OCP.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean weiter = true;

        while (weiter) {
            System.out.println();
            System.out.println("### Main Menu ###");
            System.out.println("1. Class Design");
            System.out.println("99. Beenden");
            System.out.println("#################");

            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.OCP.main.ClassDesign.ClassDesign.menu();
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

    public static String eingabe() throws IOException {
        return bfr.readLine().trim();
    }

    public static String eingabe(String text) throws IOException {
        System.out.println(text);
        return bfr.readLine().trim();
    }
}
