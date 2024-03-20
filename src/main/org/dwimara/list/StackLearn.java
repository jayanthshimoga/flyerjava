package org.dwimara.list;

import java.util.Stack;


// Last IN first OUT
// Iterable(I) --> Collection(I) --> List(I) --> Vector(C) --> Stack(C)
// Use Deque instead of Stack
public class StackLearn {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.add("RCB");
        stack.push("MI");
        stack.push("CSK");
        stack.add(2, "GT");

        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search("MI")); //provides position not index

    }
}
