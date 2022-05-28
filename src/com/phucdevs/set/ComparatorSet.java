package com.phucdevs.set;

import com.phucdevs.collections.SortingComparator;

import java.util.TreeSet;

/**
 * @author Phuc.Le
 */
public class ComparatorSet {

    public static void main(String[] args) {
        informationComparator();
        featureComparator();
    }

    private static void informationComparator() {
        System.out.println("Present in java.util.package");
        System.out.println("Contains two methods:" +
                                "compare(Object obj1, Object obj2)" +
                                "equals(Object obj)");
        System.out.println("Meant for Customized Sorting Order");
    }

    private static void featureComparator() {
        TreeSet data = new TreeSet(new SortingComparator());
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);
        System.out.println(data);
    }
}
