package com.bite.test;

import java.util.Objects;
import java.util.Stack;

/**
 * 设计最小栈
 * 找出栈中最小的元素，使用getMin（）方法
 * 要求时间常数为O（1）
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack(){
        stack=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int val){
        stack.push(val);
        if (minstack.empty()){
            minstack.push(val);
        }else if (stack.peek()<=minstack.peek()){
                minstack.push(stack.peek());
        }
    }

    public void pop(){
        int popVal=stack.pop();
        if (!minstack.empty()){
            int top=minstack.peek();
            if (top==popVal){
                minstack.pop();
            }
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minstack.peek();
    }
}
