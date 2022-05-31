package com.phucdevs.queue;

import java.util.*;

/**
 * @author Phuc.Le
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        PriorityQueue pq2 = new PriorityQueue(20);

        SortedSet ss = new TreeSet();
        PriorityQueue pq3 = new PriorityQueue(ss);

        List l = new ArrayList();
        PriorityQueue pq4 = new PriorityQueue(l);
    }
}
