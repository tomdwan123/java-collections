package com.phucdevs.array;

/**
 * @author Phuc.Le
 */
public class ArrayMain {

    public static void main(String[] args) {
        elementsAssign();
    }

    static void elementsAssign() {
        int[] x = new int[3]; // short, byte, char, int
        x[0] = 'a';
        System.out.println(x[0]); // 97

        byte b = 2;
        x[1] = b;
        System.out.println(x[0]); // 97

        Object[] objects = new Object[5];
        objects[0] = new Object();
        objects[1] = new String();

        Number[] numbers = new Number[3];
        numbers[1] = new Integer(1);
        numbers[2] = new Byte("2");
        System.out.println(numbers[1] + " " + numbers[2]); // 1 2

        Runnable[] runnables = new Runnable[5];
        runnables[0] = new Thread();
        System.out.println(runnables[0]); // Thread[Thread-0,5,main]
        System.out.println(runnables[1]); // null
    }
}
