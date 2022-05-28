package com.phucdevs.list;

import java.util.ArrayList;

/**
 * @author Phuc.Le
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList(30); // default size: 10, resize: x1.5
        al.add("John");
        al.add(1);
        al.add(true);
        System.out.println(al); // [John, 1, true]
        al.remove(1);
        System.out.println(al); // [John, true]
    }
}
