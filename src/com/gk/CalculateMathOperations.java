package com.gk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateMathOperations {
    public static void main(String[] args) {
       long sum = getSum();
        System.out.println(sum);
    }

    // sum of the squares of odd numbers from list

    static long getSum(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        long sum = 0;
        //write code here
        sum = list.stream().filter(n -> !(n %  2 == 0)).mapToInt( nn -> nn*nn).sum();
//        for( Integer number : numbers){
//            sum += (number.intValue() * number.intValue());
//        }

        return sum;
    }
}


//    Books(bookName pk, authorName) - List of authors with more than 10 books
//
//   SELECT authorName FROM Books WHERE  10 > (SELECT count(authorName) FROM Books);
