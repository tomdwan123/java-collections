package com.phucdevs.collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Phuc.Le
 */
public class CollectionsMain {

    public static void main(String[] args) {
        //dataStructure();
        interfactList();
    }

    private static void dataStructure() {
        ArrayList al = new ArrayList();
        al.add("Phuc devs");
        al.add(1);
        al.add(3.0);
        al.add(new Car("Tesla"));
        Car c = (Car) al.get(3);
        System.out.println(c.getName()); // Tesla
    }

    private static void interfactList() {
        arrayList();
        linkedList();
    }

    private static void arrayList() {
        ArrayList al = new ArrayList(30);
        al.add("John");
        al.add(1);
        al.add(true);
        System.out.println(al); // [John, 1, true]
        al.remove(1);
        System.out.println(al); // [John, true]
    }

    private static void linkedList() {
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
