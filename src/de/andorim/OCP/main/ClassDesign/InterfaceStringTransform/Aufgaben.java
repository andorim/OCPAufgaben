package de.andorim.OCP.main.ClassDesign.InterfaceStringTransform;

import java.io.IOException;
import java.util.ArrayList;

import static de.andorim.OCP.main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 22.07 ###");
            System.out.println("1. A1");
            System.out.println("2. A3");
            System.out.println("3. A4");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        A1();
                        break;
                    case 2:
                        A3();
                        break;
                    case 3:
                        A4();
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

    private static void A1() {
        String[] arr = {"mo", "di", "mi"};

        ArrayList<String> list = transform(arr);

        System.out.println(list); // [MO, DI, MI]
    }

    private static void A3() {
        Transformator tr = str -> {
            return str + ".";
        };
        String[] arr = {"mo", "di", "mi"};

        ArrayList<String> list = transform(arr, tr);

        System.out.println(list);
    }

    private static void A4() {
        Transformator tr = str -> {
            return str + "(" + str.length() + ")";
        };
        String[] arr = {"mo", "di", "mi"};

        ArrayList<String> list = transform(arr, tr);

        System.out.println(list);
    }


    private static ArrayList<String> transform(String[] array) {
        ArrayList<String> newList = new ArrayList<String>();
        for (String str : array) {
            newList.add(str.toUpperCase());
        }
        return newList;
    }

    private static ArrayList<String> transform(String[] array, Transformator tr) {
        ArrayList<String> newList = new ArrayList<String>();
        for (String str : array) {
            newList.add(tr.transform(str));
        }
        return newList;
    }


}
