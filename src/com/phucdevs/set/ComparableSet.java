package com.phucdevs.set;

import java.util.TreeSet;

/**
 * @author Phuc.Le
 */
public class ComparableSet {

    public static void main(String[] args) {
        informationComparable();
        featureComparable();
    }

    private static void informationComparable() {
        System.out.println("Present in java.lang.Package");
        System.out.println("Contains only one method compareTo(Object obj)");
        System.out.println("Meant for Default Natural Sorting Order");
    }

    private static void featureComparable() {
        TreeSet data = new TreeSet();
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);
        System.out.println(data);
    }
}
