package org.dwimara.map.functions;

import java.util.HashMap;

public class MapFunctions {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "two");
        hashMap.put(3, "three");

        // Replace All
        hashMap.replaceAll((key, value) -> value.toUpperCase());
        System.out.println(hashMap);
        hashMap.replaceAll((key, value) -> String.valueOf(key * key));
        System.out.println(hashMap);

        // Merge
        hashMap.merge(3, "10", (oldValue, newValue) -> oldValue + '/' +newValue);
        System.out.println(hashMap);

        HashMap<String, Integer> hashMap2 = new HashMap<>();

        hashMap2.put("Shoe", 150);
        hashMap2.put("Shirt", 100);
        hashMap2.put("Pant", 300);
        // Compute
        hashMap2.compute("Shoe", (key, value) -> value - value * 10/ 100); // 10% of discount
        System.out.println(hashMap2);

        // what if we want to put discount on all products
        System.out.println("Discounted Price");
        hashMap2.forEach((key, value) -> {
            value = value - value * 10/100;
            System.out.print(key + "=" + value + " ");
        });

    }
}
