package com.phucdevs.map;

/**
 * @author Phuc.Le
 */
public class HashMapDemo {

    public static void main(String[] args) {
        informationHashMap();
    }

    private static void informationHashMap() {
        System.out.println("Insert order is not preserved");
        System.out.println("Duplicate keys are not allowed");
        System.out.println("Allows null as key (Only once");
        System.out.println("Values can be null more than one");
        System.out.println("Heterogeneous elements are allowed " +
                            "as key and value both");
        System.out.println("Implements serizable and cloneable interface");
        System.out.println("Extends an abstract class AbstractMap");
        System.out.println("Best choice for search operations");
    }
}
