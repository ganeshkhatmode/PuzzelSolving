package com.gk.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo extends Thread {
   static Map<String,Integer> map = new HashMap<>();
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            map.put("ganesh", 100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put("Madhuri", 1);
        map.put("Sharvi", 2);
        map.put("Sachin", 3);
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.start();
        for (Object o : map.entrySet()){
            Object s = o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }
}
