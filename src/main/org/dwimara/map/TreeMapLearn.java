package org.dwimara.map;

import java.util.TreeMap;

/*
 *  TreeMap - Ordered
 *  HasMap - Not Ordered
 *  LinkedHashMap - Inserted Order
 *  WeakHashMap - Good for memory and Garbage Collection
 *
 */
public class TreeMapLearn {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Five", 5);

        System.out.println(treeMap.getOrDefault("Two", 0));
        System.out.println(treeMap);   //Ordered
        System.out.println(treeMap.size());
        System.out.println(treeMap.remove("One"));
        System.out.println(treeMap.putIfAbsent("Eight", 8));
        System.out.println(treeMap);

    }
}
