package com.phucdevs.collections;

import java.util.ArrayList;

/**
 * @author Phuc.Le
 */
public class CollectionsMain {

    public static void main(String[] args) {
        //dataStructure();
        arrayList();
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

    private static void arrayList() {
        ArrayList al = new ArrayList(30);
        al.add("John");
        al.add(1);
        al.add(true);
        System.out.println(al); // [John, 1, true]
        al.remove(1);
        System.out.println(al); // [John, true]
    }
}
