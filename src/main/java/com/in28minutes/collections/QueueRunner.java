package com.in28minutes.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {         // custom priority: comparing & processing from the
        return Integer.compare(value1.length(),value2.length());     // smallest to biggest string

    }
}

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();     // they are being processed in alphabetical order
        queue.offer("Apple");
        queue.addAll(List.of("Zebra", "Monkey", "Cat"));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        Queue<String> queue1 = new PriorityQueue<>(new StringLengthComparator());
        queue1.offer("Apple");
        queue1.addAll(List.of("Zebra", "Monkey", "Cat"));
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);

    }
}
