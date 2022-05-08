package com.company;

import java.util.PriorityQueue;


public class Main {
    /**
     * 优先级队列
     */
    public static void main(String[] args) {
	// write your code here
        //优先级队列添加元素
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(52);
        priorityQueue.offer(2);
        priorityQueue.offer(13);

        priorityQueue.
        System.out.println(priorityQueue.peek());

        //删除元素
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}
