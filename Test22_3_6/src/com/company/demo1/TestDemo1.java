package com.company.demo1;

import java.util.Arrays;

/**
 * 字符串（String）
 * 在C语言里没有字符串这种数据类型的！
 *
 * 什么是字符串 “ahgfh”
 * 什么是字符 ‘a’、‘杜’
 *
 * 注意在Java中没有‘\0’一说。
 *
 */
public class TestDemo1 {

    public static void main(String[] args) {
        String str1="11";
    }
    /**
     * 1.概念
     * Class文件常量池：存储的是编译的时候 int a=10；磁盘上的。
     * 运行时常量池：当程序把编译好的字节码文件，加载到JVM当中后，就会生成一个运行时常量池【方法区】，实际上是Class文件常量池。
     * 字符常量池：主要存放字符串常量，它的本质是一个哈希表。StringTable。
     * 2.什么是池：
     * 数据库连接池、线程池
     * 。。
     * 意义：提高效率的。
     * 3.什么是哈希表：数据结构》描述和组织数据的一种方式
     * 存储数据的时候，会根据一个映射关系进行存储，如何映射，需要设计一个函数（哈希函数）。
     *
     * @param args
     */
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = "hello";//与str1的地址相同因为是直接拿出来的。
        String str3 = new String("hello");//new了一个空间的val指向“hello”但它的地址是本身的地址。
        String str4 = "he" + "llo";//此时 他两都是常量，编译的时候，就已经确定好了是”hello“。
        String str5 = "he";
        String str6 = str5 + "llo";//此时 str5是一个变量，编译的时候不知道是什么。
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1 == str6);
    }

    public static void func(String str,char[] array) {
        str="duhaiqing";
        array[0]='c';

    }
    public static void main3(String[] args) {
        String str="abcd";
        char[] array={'a','b','c'};
        func(str,array);
        System.out.println(str);
        System.out.println(Arrays.toString(array));
    }

    public static void main2(String[] args) {
        String str="abc";
        String str2=str;//str和str2都指向”abc“。
        str="dfhj";//把str指向”dfhj“。
        System.out.println(str);//dfhj
        System.out.println(str2);//abc
        //注意这里只是修改指向。不能修改str和str2里面的值。
    }
    public static void main1(String[] args) {
        //定义字符串
        String str="sdjfhjd";//1
        //利用构造方法进行构造对象
        String str2=new String("dfhjdhf");//1调用构造方法
        char[] chars={'a','b','c'};
        String str3=new String(chars);//2重载构造方法



    }

}
