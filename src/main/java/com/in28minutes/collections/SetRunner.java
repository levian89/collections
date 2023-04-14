package com.in28minutes.collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class SetRunner {

    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        // unique - Set
        // TreeSet - stored in a sorted order
        // HashSet - stored in random order
        // LinkedHashSet - stored in the order of insertion

        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("treeSet " + treeSet);

        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("linkedHashSet " + linkedHashSet);

        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("hashSet " + hashSet);
    }

}
