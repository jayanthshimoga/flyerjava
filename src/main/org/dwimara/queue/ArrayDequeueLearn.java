package org.dwimara.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;


/*
 * ArrayDequeue ( no null) faster  | LinkedList (allow null ) | PriorityQueue ( sorted )
 *
 * Also, LinkedList implements List while ArrayDeque doesn't.
 * This means that LinkedList have methods like indexOf or remove(int) while ArrayDeque hasn't.
 * It can be important sometimes.
 */
public class ArrayDequeueLearn {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(10);
        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayDeque.add(101);
        arrayDeque.add(234);
        arrayDeque.add(89);
        arrayDeque.add(54);
        arrayDeque.add(334);
        arrayDeque.offer(834);
        arrayDeque.offerFirst(110);


        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.remove(54));
        System.out.println(arrayDeque.element());

        linkedList.add(101);
        linkedList.add(234);
        linkedList.add(89);
        linkedList.add(54);
        linkedList.add(334);
        linkedList.offer(834);
        linkedList.offer(null);
        linkedList.offerLast(1000);

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.peek());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList.element());
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf(334));
    }
}
