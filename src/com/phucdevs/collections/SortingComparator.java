package com.phucdevs.collections;

import java.util.Comparator;

/**
 * @author Phuc.Le
 */
public class SortingComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer d1 = (Integer) o1;
        Integer d2 = (Integer) o2;

        if (d1 < d2) return 1;
        if (d1 > d2) return -1;
        return 0;
    }
}
