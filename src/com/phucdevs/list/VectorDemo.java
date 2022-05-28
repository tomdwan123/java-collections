package com.phucdevs.list;

import java.util.Vector;

/**
 * @author Phuc.Le
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector(); // default size: 10, resize: x2
        Vector vec = new Vector(60);
        Vector vec1 = new Vector(100, 5);

        v.add(10);
        v.addElement("John");
        System.out.println(v); // [10, John]
        v.remove(0); // [John]
        System.out.println(v.elementAt(0)); // John
    }
}
