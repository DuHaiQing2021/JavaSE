package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列（Queue）
 * 特点：先进先出
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        //普通的队列
        Queue<Integer> queue=new LinkedList<>();

        //双端队列，可以从对头进对头出也可以队尾进队尾出，所以可以做栈使用，底层是一个双向链表
        Deque<Integer> queue2=new LinkedList<>();



    }
}
