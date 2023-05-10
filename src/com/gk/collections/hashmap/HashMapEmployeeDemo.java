package com.gk.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class HashMapEmployeeDemo {

    public static void main(String[] args) {
          Map<Employee, Integer> map = new HashMap<>();
          Employee employee = new Employee("Ganesh");
          Integer e1 = map.put( new Employee("Ganesh"), 100);
          Integer e2 = map.put( new Employee("Ganesh"), 200);
          System.out.println("e1 : "+e1+" e2 : "+e2);
          System.out.println(map);
          Map<Integer, Integer> m = new HashMap<>();
          m.put(new Integer(1),1);
          m.put(new Integer(1),2);
          System.out.println(m.size());
          System.out.println(m);
          ExecutorService executorService;
    }
}
