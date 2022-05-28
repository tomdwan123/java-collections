package com.phucdevs.array;

/**
 * @author Phuc.Le
 */
public class VariableAssign {

    public static void main(String[] args) {
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
