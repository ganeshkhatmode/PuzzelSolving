package com.gk.collections.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapAddNullKeys {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put(null,null);
        System.out.println(maps);
        maps.put(null, 2);
        maps.put(null, null);
        maps.put("gk1", 610000);
        maps.put("gk2", 622);
        maps.put("gk3", 16);
        maps.put("gk4", 67);
        maps.put("gk5", 64);
        maps.put("gk1", 610);
        System.out.println(maps);

        Map<String,Integer> linkedMaps = new LinkedHashMap<>();
        linkedMaps.put(null, null);
        System.out.println(linkedMaps);
        Integer nullInt = linkedMaps.put(null , null);
        System.out.println(linkedMaps+" Node :: "+nullInt);
        Integer validInt = linkedMaps.put(null , 100);
        System.out.println(linkedMaps+" Node :: "+validInt);
        Integer validInt1= linkedMaps.put("gk", 20);
        System.out.println(linkedMaps+" Node :: "+validInt1);
        Integer validInt2 = linkedMaps.put("mk1", 8);
        System.out.println(linkedMaps+" Node :: "+validInt2);
        Integer validInt3 = linkedMaps.put("sk1", 108);
        System.out.println(linkedMaps+" Node :: "+validInt3);
    }
}
