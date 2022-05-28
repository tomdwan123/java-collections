package com.phucdevs.set;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Phuc.Le
 */
public class NavigableSetDemo {

    public static void main(String[] args) {
        informationNavigableSet();
        featureNavigableSet();
    }

    private static void informationNavigableSet() {
        System.out.println("Sub interface of SortedSet");
        System.out.println("Contains methods related to Navigation functionality");
        System.out.println("Both SortedSet and NavigableSet have a same " +
                            "implementation class as TreeSet");
    }

    private static void featureNavigableSet() {
        NavigableSet<Integer> ns = new TreeSet();
        ns.add(1_000);
        ns.add(3_000);
        ns.add(13_000);
        ns.add(40_000);
        ns.add(54_000);
        System.out.println("---- Tree Set ----");
        System.out.println(ns); // [1_000, 3_000, 13_000, 40_000, 54_0000]
        System.out.println("-----------------------------------");

        System.out.println(ns.floor(13_550)); // 13_000
        System.out.println(ns.lower(14_000)); // 13_000
        System.out.println(ns.ceiling(2_500)); // 3_000
        System.out.println(ns.higher(4_000)); // 13_000
        System.out.println(ns.pollFirst()); // 1_000
        System.out.println(ns.pollLast()); // 54_000
        System.out.println(ns.descendingSet()); // [40_000, 13_000, 3_000]
    }
}
