package de.andorim.OCP.main.Collections.Queue;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class KleineAufgabePrioQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(12);
        queue.add(-5);
        queue.add(22);
        queue.add(-2);
        queue.add(0);
        queue.add(77);
        queue.add(12);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + ", ");
        }


    }

}
