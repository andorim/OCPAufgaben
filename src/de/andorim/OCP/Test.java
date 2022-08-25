package de.andorim.OCP;


import java.util.*;
import java.util.List;

import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Integer> randomChars = Stream.generate(() -> 1)
                //.parallel()
                .limit(10_000)
                .collect(ArrayList::new, (list, value) -> {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                            list.add(value);
                        }
                        , List::addAll);
        long end = System.currentTimeMillis();

        System.out.println("size:" + randomChars.size());

        System.out.println("duration (ms): " + (end - start));


    }


}




