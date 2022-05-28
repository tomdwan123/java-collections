package com.phucdevs.list;

import java.util.LinkedList;

/**
 * @author Phuc.Le
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("John");
        ll.add(10);
        ll.add(null);
        System.out.println(ll); // [John, 10, null]

        ll.set(1, 12);
        System.out.println(ll); // [John, 12, null]

        ll.add(2, true);
        System.out.println(ll); // [John, 12, true, null]

        ll.removeLast();
        System.out.println(ll); // [John, 12, true]

        ll.addFirst(1);
        ll.addLast(2);
        System.out.println(ll); // [1, John, 12, true, 2]
    }
}
