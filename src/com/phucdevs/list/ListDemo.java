package com.phucdevs.list;

import com.phucdevs.collections.Car;

import java.util.ArrayList;

/**
 * @author Phuc.Le
 */
public class ListDemo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Phuc devs");
        al.add(1);
        al.add(3.0);
        al.add(new Car("Tesla"));
        Car c = (Car) al.get(3);
        System.out.println(c.getName()); // Tesla
    }
}
