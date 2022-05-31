package com.phucdevs.map;

/**
 * @author Phuc.Le
 */
public class HashMapAndHashTable {

    public static void main(String[] args) {
        differenceHashMapAndHashTable();
    }

    private static void differenceHashMapAndHashTable() {
        System.out.println("HashMap --- HashTable");
        System.out.println("Not Thread-safe --- Thread-safe");
        System.out.println("Fast but data may be incosistent ---" +
                            "Slow because of locking");
        System.out.println("Allows one null key, multiple null values ---" +
                            "Null key and values are not allowed");
        System.out.println("1.2 version --- Legacy class");
        System.out.println("Extends AbstractMap(c) --- Extends Dictionary(c)");
    }
}
