package com.bite.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 * 中缀表达式    转 后缀表达式(逆波兰表达式)、       前缀表达式
 *  (5+4)*3-2
 *               (((5+4)*3)-2)     (((5+4)*3)-2)
 *               ((54)+3)*2-       -(*(+(54)3)2)
 *                 54+3*2-         -*+5432
 *
 */

public class TestDemo1 {
//    public static int[] fount={6,7,1,2,3,4,5};
//    public static void main(String[] args) {
//        long a=(long)Math.pow(20,10);
//        long b=(long)Math.pow(20,12);
//
//        String a1=Long.toString(a);
//        String b1=Long.toString(b);
//
//        BigInteger sa=new BigInteger(a1,10);
//        BigInteger sb=new BigInteger(b1,10);
//        BigInteger day=new BigInteger("0",10);
//        day=sa.multiply(sb);
//
//        day=day.mod(new BigInteger("7",10));
//        int n=day.intValue();
//        System.out.println(fount[n]);
//    }

    /**
     * 1.习题
     * tokens是一个字符串数组存放 2 1 + 3 * 的元素，此时存放的是一个后缀表达式，也叫逆波兰表达式
     * 求表达式的结果为
     * @param tokens
     * @return
     */
    public static Stack<Integer> evalRPN(String[] tokens){

        //用来存放逆波兰表达式结果
        Stack<Integer> stack=new Stack<>();

        for (int i=0;i<tokens.length;i++){
            String val=tokens[i];
            if (!isOperation(val)){
                int num=Integer.parseInt(val);
                stack.push(num);
            }else{
                int n2=stack.pop();
                int n1=stack.pop();
                switch(val){
                    case "+":
                        stack.push(n1+n2);
                        break;
                    case "-":
                        stack.push(n1-n2);
                        break;
                    case "*":
                        stack.push(n1*n2);
                        break;
                    case "/":
                        stack.push(n1/n2);
                        break;
                }
            }
        }
        return stack;
    }

    private static boolean isOperation(String x){
        if (x.equals("+")||x.equals("-")||x.equals("*")||x.equals("/")){
            return  true;
        }
        return  false;
    }
    public static void main(String[] args) {
        String[] str={"2","1","+","3","*"};
        Stack<Integer>  stack=evalRPN(str);
        System.out.println(stack.peek());
    }

}
