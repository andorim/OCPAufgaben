package de.andorim.OCP.main.Collections.Map.d0811;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static de.andorim.OCP.main.Main.eingabe;

public class Simple {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("##### Aufgabe 'Map - Simple #####");

        Map<String, LocalDate> map = new HashMap<String, LocalDate>();

        map.put("heute", LocalDate.now());
        map.put("gestern", LocalDate.now().minusDays(1));
        map.put("morgen", LocalDate.now().plusDays(1));

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + ": " + map.get(k));
        }

        System.out.println("###########################");

        Set<Map.Entry<String, LocalDate>> entrys = map.entrySet();

        for (Map.Entry<String, LocalDate> entry : entrys) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }


}
