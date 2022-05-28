package com.phucdevs.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author Phuc.Le
 */
public class CursorDemo {

    public static void main(String[] args) {
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
