package com.phucdevs.collections;

import java.util.ArrayList;

/**
 * @author Phuc.Le
 */
public class CollectionsMain {

    public static void main(String[] args) {
        dataStructure();
    }

    private static void dataStructure() {
        ArrayList al = new ArrayList();
        al.add("Phuc devs");
        al.add(1);
        al.add(3.0);
        al.add(new Employee("Tony"));
        Employee e = (Employee) al.get(3);
        System.out.println(e.getName()); // Tony
    }
}
