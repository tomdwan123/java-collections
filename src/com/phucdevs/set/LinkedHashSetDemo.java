package com.phucdevs.set;

import java.util.LinkedHashSet;

/**
 * @author Phuc.Le
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        informationLinkedHashSet();
        featureLinkedHashSet();
    }

    private static void informationLinkedHashSet() {
        System.out.println("Does not allow duplicates");
        System.out.println("Insertion order is preserved");
        System.out.println("Can add heterogeneous elements");
        System.out.println("We can add null value");
        System.out.println("Underlying data structure =" +
                " combination of linked list and hash table.");
        System.out.println("Implements serializable and cloneable interface");
    }

    private static void featureLinkedHashSet() {
        LinkedHashSet lhs = new LinkedHashSet();
        LinkedHashSet lhs2 = new LinkedHashSet(30);
        LinkedHashSet lhs3 = new LinkedHashSet(20, 1.00f);
    }
}
