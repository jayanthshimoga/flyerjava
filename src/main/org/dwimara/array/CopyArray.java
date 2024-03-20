package org.dwimara.array;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = a;
        int[] c = new int[a.length];

        // change in one variable affecting other
        b[0] = -1;
        for(int i: a){
            System.out.println(i);
        }

        //Solution: ArrayCopy
        System.arraycopy(a, 0, c, 0, a.length);
        System.out.println(Arrays.toString(c));

        // Arrays.copyOfRange
        int[] d = Arrays.copyOfRange(a, 2, 5);
        System.out.println(Arrays.toString(d));
    }
}
