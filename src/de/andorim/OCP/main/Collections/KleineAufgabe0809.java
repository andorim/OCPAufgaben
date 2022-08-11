package de.andorim.OCP.main.Collections;


import java.sql.Array;
import java.util.*;

public class KleineAufgabe0809 {

    public static void main(String[] args) {
        String[] arr = {"hhh", "aa", "m", "aa", "cccc", "aa"};

        List<String> list = Arrays.asList(arr);

        System.out.println("Nicht Sortiert:\n");
        printList(list);

        trenner();

        System.out.println("Sortiert:\n");
        list.sort(String::compareTo);


        printList(list);


    }

    static <T> void printList(List<T> list) {
        if (list != null) {
            for (T e : list) {
                System.out.println(e);
            }
        } else {
            throw new IllegalArgumentException("List darf nicht null sein!");
        }

        NavigableSet<Integer> set = new TreeSet<Integer>();


    }

    static void trenner() {
        System.out.println("\n###############################\n");
    }
}
