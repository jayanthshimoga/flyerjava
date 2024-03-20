package org.dwimara.map;

import java.util.LinkedHashMap;

/*
 *  TreeMap - Ordered
 *  HasMap - Not Ordered
 *  LinkedHashMap - Inserted Order
 */
public class LinkedHashMapLearn {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Five", 5);

        System.out.println(linkedHashMap.getOrDefault("Two", 0));
        System.out.println(linkedHashMap);   //Inserted Ordered
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.remove("One"));
        System.out.println(linkedHashMap.putIfAbsent("Eight", 8));
        System.out.println(linkedHashMap);
    }
}
