package org.dwimara.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayLists {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(20);

        for(int item: arrayList){
            System.out.println(item);
        }

        System.out.println("Get element of index 3 : " + arrayList.get(3));
        System.out.println("Remove element of index 2: " + arrayList.remove(2));
        System.out.println("Complete array list : " + arrayList);
        System.out.println("Contains 10 : " + arrayList.contains(10));
        System.out.println("Contains 10 : " + arrayList.size());
        int occurrence = Collections.frequency(arrayList, 20);
        System.out.println(occurrence);


        Map<Object, Long> counts = arrayList.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(counts);
    }
}
