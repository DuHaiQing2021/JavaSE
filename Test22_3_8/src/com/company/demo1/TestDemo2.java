package com.company.demo1;

/**
 * StringBuffer和StringBuilder
 * 1.相对与String类型来说StringBuffer和StringBuilder都需要new对象来使用,不能直接赋值
 * 2.从内部的方法来说大同小异
 * 3.StringBuilder是在原来的对象中进行修改不会产生新的对象。
 * 4.普通的String拼接会被优化为StringBuiler。如果在循环里面进行字符串的拼接尽量不要用String使用StringBuiler会更好。
 * 5.StringBuiler和StringBuffer主要的区别是StringBuiler一般是用于单线程。StringBuffer用于多线程。
 * 6.StringBuffer类型方法中多了synchronized关键字相当于”锁“的意思，它的含义是保证线程安全，用于多线程。
 */
public class TestDemo2 {

    public static void main2(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("sdfhj");
        for (int i=0;i<10;i++) {
            stringBuilder.append(i);
        }
        String s=stringBuilder.toString();
        System.out.println(s);
    }
    public static void main1(String[] args) {
        StringBuilder sb=new StringBuilder("absdffg");
        sb.append("fhajf");
        System.out.println(sb.toString());
    }

}
