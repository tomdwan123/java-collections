package com.phucdevs.array;

/**
 * @author Phuc.Le
 */
public class ArrayMain {

    public static void main(String[] args) {
        //elementsAssign();
        variablesAssign();
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

    static void variablesAssign() {
        int[] x = new int[2];
        int[] a = x;
        System.out.println(x[0]); // 0
        System.out.println(a[0]); // 0

        int[] x2 = new int[2];
        int[] a2 = x2;
        x2[0] = 1;
        System.out.println(x2[0]); // 1
        System.out.println(a2[0]); // 1
        a2[1] = 2;
        System.out.println(x2[1]); // 2
        System.out.println(a2[1]); // 2

        int[] b = {1, 2, 3};
        int[] c = {11, 22};
        b = c;
        for (int i : b) // 2 11 22
            System.out.println(i);
        for (int i : c) // 11 22
            System.out.println(i);

         String[] s = new String[3];
         Object[] o = s;
    }
}
