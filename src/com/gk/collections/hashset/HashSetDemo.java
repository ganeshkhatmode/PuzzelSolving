package com.gk.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean r1 = set.add("abc");
        System.out.println("r1 : " + r1);
        boolean r2 = set.add("abc");
        System.out.println("r2 : "+r2);
        System.out.println(set);
    }
}
