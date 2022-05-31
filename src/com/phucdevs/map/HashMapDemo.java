package com.phucdevs.map;

import java.util.HashMap;

/**
 * @author Phuc.Le
 */
public class HashMapDemo {

    public static void main(String[] args) {
        informationHashMap();
        featureHashMap();
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

    private static void featureHashMap() {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Math", 80);
        marks.put("English", 90);
        System.out.println(marks);

        marks.put("Science", 10);
        System.out.println(marks);
        System.out.println(marks.clone());// natural order

        System.out.println(marks.values());
        System.out.println(marks.entrySet());
        System.out.println(
                marks.computeIfAbsent("Hello", k -> 1));
    }
}
