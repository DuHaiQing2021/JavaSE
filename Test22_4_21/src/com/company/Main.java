package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列（Queue）
 * 特点：先进先出
 *
 * 总结：
 * 1.LinkedList来说，他不仅可以可以当做普通的队列，也可以当做双端队列，
 * 也可以当做双向链表，也可以当作栈来使用。
 * 2.对于链表本身来说，是没有下标的。
 * ArrayList和LinkedList的区别是什么？
 * 1、共性，增删改查来说：例如：ArrayList
 * 2、内存的逻辑来说：例如：链表LinkedList是物理上连续的，连续存储的，顺序表ArrayList是使用数组进行存储的
 */
public class Main {
    public static void main3(String[] args) {
        //双端队列，可以从对头进对头出也可以队尾进队尾出，所以可以做栈使用，底层是一个双向链表
        Deque<Integer> queue2=new LinkedList<>();

        //入队
        queue2.offer(1);//默认队尾入队
        queue2.add(15);
        queue2.offerFirst(2);//从头入队
        queue2.offerLast(3);//从队尾入队

        //出队
        queue2.pollFirst();
        queue2.pollLast();

        //查看
        System.out.println(queue2.peek());
        System.out.println(queue2.peekFirst());

    }

    public static void main2(String[] args) {
        //普通的队列
        Queue<Integer> queue=new LinkedList<>();

        //入队
        queue.add(12);     //使用add方法入队
        queue.offer(3);  //使用offer方法入队


        //出队
        System.out.println(queue.remove());//默认移除12，移除对头元素
        System.out.println(queue.remove(12));//如果指定则直接移除队列里该元素，如果移除成功返回true，否则返回false
        System.out.println(queue.poll());  //移除对头元素


        //查看对头元素,queue为空返回null
        System.out.println(queue.peek());
    }
    public static void main1(String[] args) {
	// write your code here
        //普通的队列
        Queue<Integer> queue=new LinkedList<>();

        //双端队列，可以从对头进对头出也可以队尾进队尾出，所以可以做栈使用，底层是一个双向链表
        Deque<Integer> queue2=new LinkedList<>();


        //因为队列queue的底层就是链表，所以可以定义成
        LinkedList<Integer> queue3=new LinkedList<>();// 我们可以看到它实现了队列的各种接口implements List<E>, Deque<E>, Cloneable, java.io.Serializable


    }
}
