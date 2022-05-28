package com.phucdevs.set;

import com.phucdevs.collections.Employee;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Phuc.Le
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        SortedSet ss = new TreeSet();
        TreeSet ts2 = new TreeSet(ss);
        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs);

        TreeSet<Employee> ts4 = new TreeSet<Employee>();
        ts4.add(new Employee("John", 30_000));
        ts4.add(new Employee("Tony", 40_000));
        ts4.add(new Employee("Marry", 20_000));
        System.out.println(ts4);
    }
}
