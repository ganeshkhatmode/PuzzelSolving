package com.gk.string_s;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigitCountFromString {
    public static void main(String[] args) {
        String str = "12godhu56abb56fs9";
        Set<Integer> number = new HashSet<>();

        for(int count = 0 ; count < str.length(); count++) {
            if(Character.isDigit(str.charAt(count))) {
                number.add(Integer.parseInt(String.valueOf(str.charAt(count))));
            }
        }
        System.out.println(number);
    }
}
