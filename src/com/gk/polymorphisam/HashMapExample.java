package com.gk.polymorphisam;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        String str1="Hello";
        map1.put(str1,1);
        String str2= new String("Hello");
        map1.put(str2,2);
        String str3= new String("Hello");
        map1.put(str3,3);
        System.out.println(map1.size());
        System.out.println(map1);
        System.out.println(map1.get("Hello"));
        System.out.println(map1.get(new String("Hello")));
    }
}
