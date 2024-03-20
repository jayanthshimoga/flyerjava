package org.dwimara.array;

public class Arrays {

    public static void main(String[] args) {
        String[] s = new String[10];
        int[] a = {2, 3, 4, 5, 6, -9, 9, 9, 10};

        System.out.println("FOR-EACH LOOP");
        for (int item : a){
            System.out.println(item);
        }

        System.out.println("FOR LOOP");
        for(int loop=0; loop < a.length; loop++){
            System.out.println(a[loop]);
        }
    }
}
