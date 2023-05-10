package com.gk.logic;

public class PalindromNumber {
    public static void main(String[] args) {
        int number = 12;
        int reverseNumber = 0;
        while (number != 0){
            reverseNumber = number%10+reverseNumber*10;
            number = number/10;
        }
        System.out.println(" "+reverseNumber+12+"");
    }
}
