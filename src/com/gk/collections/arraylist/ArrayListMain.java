package com.gk.collections.arraylist;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Problem statement:
 *     Find 3 distinct smallest numbers from an array of integer
 *     example - {4,1,13,90,16,2,0}
 *     output - {0,1,2}
 */
public class ArrayListMain {
    public static void main(String[] args) {
        int[] numbers = {4,1,13,90,16,2,0};
        firstApproach(numbers);
        secondApproach(numbers);
    }

    public static void firstApproach(int[] numbers) {
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);
        for (int i=0; i < 3; i++){
            System.out.println("Number :: "+copy[i]);
        }
    }
    public static void secondApproach(int[] numbers) {
        IntStream.of(numbers)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
