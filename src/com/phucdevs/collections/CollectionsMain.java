package com.phucdevs.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * @author Phuc.Le
 */
public class CollectionsMain {

    public static void main(String[] args) {
        //dataStructure();
        interfaceList();
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

    private static void interfaceList() {
        arrayList();
        linkedList();
        vector();
        stack();
    }

    private static void arrayList() {
        ArrayList al = new ArrayList(30); // default size: 10, resize: x1.5
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

    private static void vector() {
        Vector v = new Vector(); // default size: 10, resize: x2
        Vector vec = new Vector(60);
        Vector vec1 = new Vector(100, 5);

        v.add(10);
        v.addElement("John");
        System.out.println(v); // [10, John]
        v.remove(0); // [John]
        System.out.println(v.elementAt(0)); // John
    }

    private static void stack() {
        Stack s = new Stack();
        s.push(10);
        s.push(30);
        s.push(true);
        System.out.println(s); // [10, 30, true]
        System.out.println(s.pop()); // true
        System.out.println(s); // [10, 30]
        System.out.println(s.peek()); // 30
        System.out.println(s); // [10, 30]
        System.out.println(s.empty()); // false
        System.out.println(s.search(10)); // 2
    }
}
