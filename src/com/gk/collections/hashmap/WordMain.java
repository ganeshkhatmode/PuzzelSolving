package com.gk.collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordMain {
    public static void main(String[] args) {
        List<Word> words = new ArrayList<>();
        Word word = new Word("gk", 1);
        Word word1 = new Word("gk", 2);
        Word word2 = new Word("gk", 3);
        words.add(word);
        words.add(word1);
        words.add(word2);
        System.out.println(words);
        Map<Word, Integer> wordIntegerMap = new HashMap<>();
        Integer w1 = wordIntegerMap.put(word,100);
        System.out.println("hash number :: "+w1);
        Integer wordT = wordIntegerMap.put(word1,200);
        System.out.println("hash number :: "+wordT);
        Integer w3 = wordIntegerMap.put(word2,3);
        System.out.println("hash number :: "+w3);
        System.out.println(wordIntegerMap);

    }
}
