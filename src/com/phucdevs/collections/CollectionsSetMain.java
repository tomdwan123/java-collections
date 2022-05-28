package com.phucdevs.collections;

import java.util.HashSet;

/**
 * @author Phuc.Le
 */
public class CollectionsSetMain {

    public static void main(String[] args) {
        informationSet();
        implementSet();
    }

    private static void informationSet() {
        System.out.println("Duplicates are not elements");
        System.out.println("Insertion Order is not preserved");
        System.out.println("Accept heterogeneous objects");
    }

    private static void implementSet() {
        hashSet();
    }

    private static void hashSet() {
        informationHashSet();
        featureHashSet();
    }

    private static void informationHashSet() {
        System.out.println("Does not allow duplicates");
        System.out.println("Insertion order is not preserved");
        System.out.println("Can add heterogeneous elements");
        System.out.println("We can add null value");
        System.out.println("Implements serializable and cloneable interface");
    }

    private static void featureHashSet() {
        HashSet hs = new HashSet(); // default size: 16
        HashSet hs2 = new HashSet(100); // resize: x2

        hs.add(1);
        hs.add(true);
        hs.add("John");
        System.out.println(hs);

        hs.add(true);
        hs.add(null);
        System.out.println(hs);
    }
}
