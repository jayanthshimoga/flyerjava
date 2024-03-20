package org.dwimara.map;

import java.util.HashMap;

public class HashMapLearn {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        System.out.println(hashMap.get("two"));
        System.out.println(hashMap.remove("three"));
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.putIfAbsent("four", 4));
        System.out.println(hashMap);
        System.out.println(hashMap.replace("one", 11));

        System.out.println("Access keys: " +hashMap.keySet());
        System.out.println("Access values: " +hashMap.values());
        System.out.println("Access Items: " +hashMap.entrySet());
    }
}

/**
 *
 * Methods:::
 *
 *
 * put
 * putIfAbsent
 * get
 * getOrDefault
 * remove
 * replace
 * size
 *
 *
 * keySet
 * values
 * entrySet
 *
 * containsKey
 * containsValue
 *
 */
