package de.andorim.OCP.main.ClassDesign.InterfacesComparable;

import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static de.andorim.OCP.main.Main.eingabe;

public class Aufgaben {
    private static final OS[] os = new OS[4];

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 21.07 ###");
            System.out.println("1. A3");
            System.out.println("2. A4");
            System.out.println("3. A5");
            System.out.println("4. A6");
            System.out.println("5. A7");
            System.out.println("6. A8");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        A3();
                        break;
                    case 2:
                        A4();
                        break;
                    case 3:
                        A5();
                        break;
                    case 4:
                        A6();
                        break;
                    case 5:
                        A7();
                        break;
                    case 6:
                        A8();
                        break;
                    case 99:
                        weiter = false;
                        break;
                    default:
                        System.out.println("Fehler bei der Eingabe!");
                }
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Fehler bei der Eingabe!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void createOSArray() {
        os[0] = new OS("Linux", 3);
        os[1] = new OS("Windows", 95);
        os[2] = new OS("Mac", 9);
        os[3] = new OS("Linux", 1);
    }

    private static void printOSArray(OS[] os) {
        for (int i = 0; i < os.length; i++) {
            System.out.format("| %1$1s. | %2$10s | %3$3s |\n", i, os[i].name, os[i].version);
        }
    }

    private static void A3() {
        createOSArray();
        printOSArray(os);

    }

    private static void A4() {
        createOSArray();
        Arrays.sort(os);
        printOSArray(os);

    }

    private static void A5() {
        Comparator<OS> reverse = (o1, o2) -> o1.compareTo(o2) * -1;

        createOSArray();
        Arrays.sort(os, reverse);
        printOSArray(os);


    }

    private static void A6() {
        createOSArray();
        Arrays.sort(os);
        int index = Arrays.binarySearch(os, new OS("Linux", 3));
        System.out.println("| " + index + ". " + os[index]);
    }

    private static void A7() {
        createOSArray();

        Comparator<OS> reverse = (o1, o2) -> o1.compareTo(o2) * -1;

        Arrays.sort(os, reverse);
        int index = Arrays.binarySearch(os, new OS("Windows", 95), reverse);

        printOSArray(os);
        System.out.println("\n");

        System.out.println("| " + index + ". " + os[index]);
    }

    private static void A8() {
        createOSArray();
        shuffle2(os);
        printOSArray(os);
    }

    private static void shuffle(OS[] o) {
        Random random = new Random();
        int maxIndex = o.length;

        for (int i = 0; i < 10; i++) {
            int from = random.nextInt(maxIndex);
            int to = random.nextInt(maxIndex);

            OS tmp = os[to];
            os[to] = os[from];
            os[from] = tmp;
        }
    }

    private static void shuffle2(OS[] o) {
        Comparator<OS> random = (o1, o2) -> {
            Random rand = new Random();
            return -1 + rand.nextInt(3);
        };
        Arrays.sort(o, random);
    }


}
