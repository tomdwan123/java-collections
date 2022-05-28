package com.phucdevs.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/**
 * @author Phuc.Le
 */
public class CollectionsListMain {

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
        cursor();
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

    private static void cursor() {
        // 4 types:
            // enumeration
            // iterator
            // listIterator
            // Spliterator

        //Vector v = createVector();
        //enumeration(v);

        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        iterator(l);

        ArrayList<String> s = new ArrayList<>();
        s.add("One");
        s.add("Two");
        s.add("Three");
        listIterator(s);
    }

    private static Vector createVector() {
        Vector v = new Vector();
        System.out.println("Enter elements:");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 8; i++) {
            Integer number = scanner.nextInt();
            v.addElement(number);
        }
        System.out.println(v);

        return v;
    }

    private static void enumeration(Vector v) {
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer number = (Integer) e.nextElement();
            if (number % 3 ==0)
                System.out.println(number);
        }
    }

    private static void iterator(ArrayList<Integer> l) {
        System.out.println("List before: " + l);

        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            Integer number = (Integer) itr.next();
            if (number % 3 == 0) {
                System.out.println(number);
            } else {
                itr.remove();
            }
        }
        System.out.println("List after: " + l);
    }

    private static void listIterator(ArrayList<String> l) {
        System.out.println("List before: " + l); // [One, Two, Three]

        ListIterator litr = l.listIterator();
        while (litr.hasNext()) {
            String item = (String) litr.next();
            if (item.equals("One")) {
                litr.add("new one");
            }

            if (item.equals("Two")) {
                litr.remove();
            }

            if (item.equals("Three")) {
                litr.set("update three");
            }
        }
        System.out.println("List after: " + l); // [One, new one, update three]
    }
}

