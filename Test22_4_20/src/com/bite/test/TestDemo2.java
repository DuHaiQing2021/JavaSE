package com.bite.test;

import java.util.Stack;

/**
 * Stack栈的运用
 *
 */
public class TestDemo2 {
    public static void main(String[] args) {
        //栈的定义，规定存放整形数据
        Stack<Integer> stack=new Stack<>();

        //对数据进行入栈push（放）
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //对数据进行出栈pop（弹出）
        System.out.println(stack.pop());//弹出栈顶元素，并且删除

        //获取栈顶元素，不删除peek
        System.out.println(stack.peek());

        //查看栈是否为空
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());


    }

}
