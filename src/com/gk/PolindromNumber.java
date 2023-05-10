package com.gk;

public class PolindromNumber {
    public static void main(String[] args) {
        int number = 121;
        findPolindromNumber(number);
    }
    public static void findPolindromNumber(int number){
         int reverseNumber = number;
         while (reverseNumber != 0){
            int mod = reverseNumber % 10 + reverseNumber;
            reverseNumber = reverseNumber / 10;
         }
    }
}


//emid, name, mangerId
//
//name - managename
//
//SELECT name , name as manageName FROM employee;
//
