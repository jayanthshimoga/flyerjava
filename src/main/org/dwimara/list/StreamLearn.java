package org.dwimara.list;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
 *  A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 *
 *  The List is an interface, and the ArrayList is a class of Java Collection framework.
 *  The List creates a static array, and the ArrayList creates a dynamic array
 */
public class StreamLearn {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,3,4,1,5,6,5,5,2,4));
        System.out.println(arrayList);

        // 1. MAP
        List<Integer> result = arrayList.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(result);

        // 2. Filter
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> res = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(res);

        // 3. Sorted
        List<Integer> sortedResult = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedResult);

        // 4. Find Occurrence
        Map<Object, Long> mapres = arrayList.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(mapres);

        // 5. Find duplicates
        Set<Integer> items = new HashSet<>();
        List<Integer> duplicates = arrayList.stream().filter(x->!(items.add(x))).collect(Collectors.toList());
        System.out.println(duplicates);


        // 6. word count
        List<Object[]> characters = new ArrayList<>();
        List<String> words = Arrays.asList("Banana", "Mango", "BlueBerry", "DragonFruit");
        characters = words.stream().map(x-> Arrays.stream(x.split("")).toArray()).collect(Collectors.toList());
        System.out.println(characters);
        Map<Object, Long> wordCount  = words.stream().collect(
                Collectors.groupingByConcurrent(
                        Function.identity(), Collectors.<String> counting()));
        System.out.println(wordCount);

    }
}
