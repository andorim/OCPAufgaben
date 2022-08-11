package de.andorim.OCP.main.Collections.Map.d0811;

import java.util.*;
import java.util.Map;


public class TextStatistics {
    String text;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("##### Aufgabe 'Map - TextStatistics'");

        TextStatistics stat = TextStatistics.of("Heute ist Montag!");

        Collection<Character> chars = stat.getUniqueChars();

        System.out.println(chars);

        System.out.println("############################");

        System.out.println(stat.getCharCounts());

        System.out.println("V2");

        System.out.println(stat.getCharCountsV2());
    }

    static TextStatistics of(String str) {
        TextStatistics stats = new TextStatistics();
        stats.text = str;
        return stats;
    }

    Collection<Character> getUniqueChars() {
        Collection<Character> col = new TreeSet<>();
        for (int i = 0; i < text.length(); i++) {
            col.add(text.charAt(i));
        }
        return col;
    }

    java.util.Map<Character, Integer> getCharCounts() {
        java.util.Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (map.get(c) == null) {
                map.put(text.charAt(i), 1);
            } else {
                int count = map.get(c) + 1;
                map.put(c, count);
            }

        }

        return map;
    }

    java.util.Map<Character, Integer> getCharCountsV2() {
        Map<Character, Integer> map = new TreeMap<>();
        for (Character c : getUniqueChars()) {
            map.put(c, 0);
        }
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
        }

        return map;
    }
}


