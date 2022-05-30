package com.phucdevs.hashtable;

import java.util.ArrayList;

/**
 * @author Phuc.Le
 */
public class HashSetDemo {

    private final int SIZE = 1_000;
    private ArrayList<Integer> buckets[];

    public HashSetDemo() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i <buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucketItems = buckets[hashValueIndex];
        int indexOfKey = bucketItems.indexOf(key);
        if (indexOfKey < 0) bucketItems.add(key);
    }

    private void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucketItems = buckets[hashValueIndex];
        int indexOfKey = bucketItems.indexOf(key);
        if (indexOfKey >= 0) bucketItems.remove(key);
    }

    private boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucketItems = buckets[hashValueIndex];
        int indexOfKey = bucketItems.indexOf(key);
        return indexOfKey >= 0;
    }

    public static void main(String[] args) {
        HashSetDemo hashSetDemo = new HashSetDemo();
        hashSetDemo.add(1);
        hashSetDemo.add(2);
        hashSetDemo.add(1);
        hashSetDemo.remove(1);
        hashSetDemo.contains(2);
    }
}
