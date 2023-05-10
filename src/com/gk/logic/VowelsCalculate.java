package com.gk.logic;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Problem statement :
 *  TO calculate substring with given k
 *  created substring to check the number of vowels in substring
 *  then return max number of vowels count
 */
public class VowelsCalculate {
    public static long calculateVoewls(String str) {
        Character[] chars = {'a','e','i','o','u'};
        Set<Character> characters = new HashSet<>(Arrays.asList(chars));
        char[] strChars = str.toCharArray();
        long count = 0;
        for( char c : strChars){
               if(characters.contains(c) ){
                   count += 1;
               }
           }
        return count;
    }

    public static void main(String[] args) {
        String s = "eiuaooo";
        int k = 4; // 0 1 2 3 4 5 6 7 8
        Map<String,Long> vowelsCountMap = new LinkedHashMap<>();
        for(int count = 0 ; count <= (s.length()- k); count++){

                String keyStr = s.substring(count, count + k);
                vowelsCountMap.put(keyStr, calculateVoewls(keyStr));

        }
        System.out.println(vowelsCountMap);
        Optional<Map.Entry<String, Long>> result = vowelsCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        long resultCount = result.get().getValue();
        if(resultCount == 0) {
            System.out.println("Not found!");
        } else
        System.out.println(result.get().getKey());
    }
}
