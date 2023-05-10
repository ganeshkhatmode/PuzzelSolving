package com.gk.polymorphisam;

import java.util.*;

/**
 * Problem statement
 *  Find max word occurance in give string
 *  example - Ganesh is good programmer He is doing good coding practice
 *  output - is=> 2, good => 2
 */
public class WordCalculate {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String statement = "Ganesh is good programmer He IS doing good coding practice";
        String[] words = statement.split("\\s+");
        System.out.println(words.length);
        List<Word> wordList = new ArrayList<>();
        for(String word : words) {
           Word w = new Word(word, 1);
           if(wordList.contains(w)){
               w.setCount(w.getCount()+1);
               wordList.add(w);
           } else {
               wordList.add(w);
           }
//            if(map.containsKey(word)) {
//                map.put(word, map.get(word)+1);
//            } else {
//                map.put(word , 1);
//            }
        }
        System.out.println(wordList);
        Collections.sort(wordList);
        System.out.println(wordList);

//        System.out.println(map);
//        Map.Entry<String, Integer> result = map.entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue()).get();
//        System.out.println(result);
    }
}
