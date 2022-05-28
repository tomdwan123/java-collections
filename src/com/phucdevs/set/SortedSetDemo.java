package com.phucdevs.set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Phuc.Le
 */
public class SortedSetDemo {

    public static void main(String[] args) {
        informationSortedSet();
        featureSortedSet();
    }

    private static void informationSortedSet() {
        System.out.println("Does not allow duplicates");
        System.out.println("Insertion order is preserved asc");
        System.out.println("Can add heterogeneous elements");
        System.out.println("We can add null value");
        System.out.println("Implements serializable and cloneable interface");
    }

    private static void featureSortedSet() {
        SortedSet ss = new TreeSet();
        ss.add(5);
        ss.add(10);
        ss.add(2);
        ss.add(1);
        ss.add(3);
        ss.add(7);
        System.out.println(ss); // [1, 2, 3, 5, 7, 10]

        System.out.println(ss.first()); // 1
        System.out.println(ss.last()); // 10

        System.out.println(ss.headSet(3)); // [1, 2]
        System.out.println(ss.tailSet(3)); // [3, 5, 7, 10]
        System.out.println(ss.subSet(3, 7)); // [3, 5]

        System.out.println(ss.comparator()); // null
    }
}
