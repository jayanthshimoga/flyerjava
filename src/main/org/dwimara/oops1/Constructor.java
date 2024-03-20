package org.dwimara.oops1;

public class Constructor {  // Class

    int a;
    boolean flag;

    Constructor(int a, boolean flag){ // constructor
        this.a = a;
        this.flag = flag;
    }

    public static void main(String[] args) { // main method
        Constructor c1 = new Constructor(10, true);

        // prints default value if no constructor
        System.out.println(c1.a);
        System.out.println(c1.flag);

    }
}
