package com.gk.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestIntermediateOperation {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,7,8,12,53,96,10};
        List<Integer> numbersStream = Stream.of(numbers).filter(n -> n%1 == 0).collect(Collectors.toList());
        numbersStream.forEach(System.out::print);
    }
}
