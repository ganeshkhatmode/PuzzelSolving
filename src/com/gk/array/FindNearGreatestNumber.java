package com.gk.array;

import java.util.Arrays;
import java.util.Stack;

/**
 * Problem statement:
 *   Find nearest greater number from integer array
 *   Example - [9,2,4,1,2,7,8,1,4,3]
 *   output - [-1,4,7,2,7,8,-1,4,-1,-1]
 */
public class FindNearGreatestNumber {
    public static void main(String[] args) {
//        int[] arr = {9,2,4,1,2,7,8,1,4,3};
//        firstApproach(arr);
        int[] arr = {13,7,6,12};
        secondApproach(arr);
    }
    public static void firstApproach(int[] arr) {
        int[] ngn = new int[arr.length];
        System.out.println("Before found nearest greater number Array:");
        printArray(arr);
        //check every element
        for(int i=0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    ngn[i] = arr[j];
                    break;
                } else {
                    ngn[i] = -1;
                }
            }
            if(arr.length-1 == i){
                ngn[i] = -1;
            }
        }
        System.out.println("After found greatest number:");
        printArray(ngn);
    }

    /**
     * Rule: Smaller or equal elements can be pushed over the top element of stack
     * @param numbers
     */
    public static void secondApproach(int[] numbers){
         int[] ngn = new int[numbers.length];
         printArray(numbers);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            if(stack.empty()) {
                stack.push(i);
            } else {
                if (stack.peek() <= numbers[i]) {
                    stack.push(i);
                }
            }
        }
        System.out.println("\n"+stack);
    }
    public static void printArray(int[] numbers) {
        for(int num : numbers) {
            System.out.print(num+",");
        }
        System.out.println();
    }
}
