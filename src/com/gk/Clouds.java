package com.gk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Clouds {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        Map<Integer, Integer> out = IntStream.range(0, c.size())
                .boxed()
                .collect(Collectors.toMap(Function.identity(), c::get));
        System.out.println(out);
        List<Integer> skipJumpClouds = new ArrayList<>();
        skipJumpClouds = out.entrySet().stream().filter(n-> (n.getValue() == 1) ).map(n-> n.getKey()).collect(Collectors.toList());
        System.out.println(skipJumpClouds);

    }
}
