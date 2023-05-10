package com.gk.collections.hashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo extends  Thread {
    static ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
    @Override
    public void run() {
        try {
            Thread.sleep(100);
            map.put("Ganesh" , 1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put("Madhuri", 2);
        map.put("Sharvi", 3);
        ConcurrentHashMapDemo concurrentHashMapDemo = new ConcurrentHashMapDemo();
        concurrentHashMapDemo.start();
        for (Object o : map.entrySet()) {
            Object s = o;
            System.out.println(s);
            sleep(1000);
        }

        System.out.println(map);
    }
}
