package com.phucdevs.list;

import java.util.Stack;

/**
 * @author Phuc.Le
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(30);
        s.push(true);
        System.out.println(s); // [10, 30, true]
        System.out.println(s.pop()); // true
        System.out.println(s); // [10, 30]
        System.out.println(s.peek()); // 30
        System.out.println(s); // [10, 30]
        System.out.println(s.empty()); // false
        System.out.println(s.search(10)); // 2
    }
}
