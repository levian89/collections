package com.in28minutes.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. " +
                "This has never happened before.";

        Map<Character, Integer> occurrences = new HashMap<>();
//        occurrences.put('T', 1);
//        occurrences.put('h', 1);
//        occurrences.put('i', 2);

        char[] characters = str.toCharArray(); // this would return all the elements in a Character Array
        for(char character:characters) {        // implementing the algorithm in which we print the number of occurrences
            //Get the character                     // for all the individual characters in the String str
            Integer integer = occurrences.get(character);
            if(integer==null) {
                occurrences.put(character, 1);
            } else {
                occurrences.put(character, integer+1);
            }
            //if it is there, we increment the count
            //if it was not there before, we initialize to 1

            //System.out.println(str.toCharArray());
           System.out.println(occurrences);
        }

        Map<String, Integer> stringOccurrences = new HashMap<>();
        String[] words = str.split(" ");    // we split the String str by spaces

        for(String word:words) {                                        // implementing the algorithm in which we print the number
            //Get the word                                              // of occurrences for all the individual (sub)strings in the
            Integer integer = stringOccurrences.get(word);              // String str
            if(integer==null) {
                stringOccurrences.put(word,1);
            } else {
                stringOccurrences.put(word, integer+1);
            }
            //if it is there, we increment the count
            //if it was not there before, we initialize to 1

            //System.out.println(character);
           System.out.println(stringOccurrences);
        }

    }
}
