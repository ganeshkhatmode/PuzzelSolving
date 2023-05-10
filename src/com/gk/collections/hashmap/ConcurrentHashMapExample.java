package com.gk.collections.hashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/*
   In ConcurrentHashMap not allowed null key and value
   Multiple thread work on same object
   modification allowed iterating time
   not hole object lock only some block is lock

 */
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("Ganesh", 122);
        concurrentHashMap.put("Madhuri", 145);
        concurrentHashMap.put("Sharvi", null);
        concurrentHashMap.put(null, 00);
        System.out.println(concurrentHashMap);
    }
}
