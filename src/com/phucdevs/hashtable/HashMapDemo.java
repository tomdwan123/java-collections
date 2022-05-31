package com.phucdevs.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Phuc.Le
 */
public class HashMapDemo {

    private final int SIZE = 1_000;
    private ArrayList<Data> buckets[];

    public HashMapDemo() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % SIZE;
    }

    private void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucketItems = buckets[hashValueIndex];
        Data newData = new Data(key, 0);
        int keyIndex = bucketItems.indexOf(newData);
        if (keyIndex >= 0) {
            bucketItems.get(keyIndex).value = value;
        } else {
            bucketItems.add(newData);
        }
    }

    private void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucketItems = buckets[hashValueIndex];
        Data compareData = new Data(key, 0);
        bucketItems.remove(compareData);
    }

    private int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucketItems = buckets[hashValueIndex];
        Data compareData = new Data(key, 0);
        int keyIndex = bucketItems.indexOf(compareData);
        if (key >= 0 )
            return bucketItems.get(keyIndex).value;

        return -1;
    }

    public static void main(String[] args) {
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.put(1, 1);
        hashMapDemo.put(1, 2);
        hashMapDemo.put(2, 2);
        hashMapDemo.remove(1);
        hashMapDemo.get(1);
        hashMapDemo.get(2);

        int[] numbers1 = {1, 1, 2, 3, 2};
        int[] numbers2 = {1, 2, 3, 4, 5};
        findTimesOccurrencesNumber(numbers1);
        findTimesOccurrencesNumber(numbers2);
    }

    /**
     * Input: Cho 1 mảng các số nguyên
     * Output: Trả ra số lần xuất hiện của mỗi số
     */
    private static void findTimesOccurrencesNumber(int[] numbers) {
        Map<Integer, Integer> mapNumbers = new HashMap<>();
        for (int number : numbers) {
            if (mapNumbers.containsKey(number)) {
                mapNumbers.put(number, mapNumbers.get(number) + 1);
            } else {
                mapNumbers.put(number, 1);
            }
        }

        for (Map.Entry entry: mapNumbers.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện "
                    + entry.getValue() + " (lần)");
        }
    }
}

class Data {

    public int key;
    public int value;
    public Data(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Data)
            return this.key == ((Data) other).key;
        return false;
    }
}
