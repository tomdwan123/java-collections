package com.phucdevs.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

        int[] numbers1 = {1, 2, 1};
        int[] numbers2 = {1, 2, 3};
        System.out.println(checkDuplicateNumbers(numbers1));
        System.out.println(checkDuplicateNumbers(numbers2));
    }

    /**
     * Input: Cho 1 danh sách các số tự nhiên
     * Output:
     *      + Trả về true nếu tồn tại bất kỳ phần tử
     *      nào có số lần xuất hiện >= 2
     *      + Trả về false nếu tất cả phần tử đều distinct
     */
    private static boolean checkDuplicateNumbers(int[] numbers) {
        Set<Integer> setNumbers = new HashSet<>();
        for (int number : numbers) {
            if (setNumbers.contains(number)) {
                return true;
            } else {
                setNumbers.add(number);
            }
        }

        return false;
    }
}
