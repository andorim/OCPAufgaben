package de.andorim.OCP.main.Collections.Map.d0811;

import java.util.HashMap;
import java.util.Set;

public class KleineAufgabeMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Januar");
        map.put(2, "Februar");
        map.put(3, "März");


        map.forEach((k, s) -> System.out.println("Key:" + k + " Value: " + s));

        Set<Integer> keys = map.keySet();

        for (Integer i : keys) {
            System.out.println(map.get(i));
        }

    }
}
