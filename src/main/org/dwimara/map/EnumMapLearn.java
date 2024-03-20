package org.dwimara.map;

import java.util.EnumMap;

public class EnumMapLearn {

    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        EnumMap<Days, Integer> enumMap = new EnumMap<Days, Integer>(Days.class);

        enumMap.put(Days.SUNDAY, 1);
        enumMap.put(Days.MONDAY, 2);
        enumMap.put(Days.TUESDAY, 3);
        enumMap.put(Days.WEDNESDAY, 4);
        enumMap.put(Days.THURSDAY, 5);
        enumMap.put(Days.FRIDAY, 6);
        enumMap.put(Days.SATURDAY, 7);

        System.out.println(enumMap);
        System.out.println(enumMap.getOrDefault(Days.SUNDAY, 0));
        System.out.println(enumMap.remove(Days.SATURDAY));
        System.out.println(enumMap.replace(Days.FRIDAY, 8));
        System.out.println(enumMap);

    }
}
