package com.bite.test;

/**
 * 栈和队列
 * 1.栈
 * 什么是栈？
 *    栈其实就是一种数据结构，特点：先进后出，后进先出
 * 什么是Java虚拟机栈？
 *    此时JVM stack只是JVM当中的一块内存，该内存一般用来存放；例如：局部变量。
 *    在哪里开辟呢？JVM stack中
 * 什么是栈帧？
 *    调用函数的时候，我们会为了这个函数开辟一块内存，叫做栈帧。
 */
public class TestDemo {
    /**
     * 栈的作用，用在哪里
     *   1.入栈和出栈顺序：一个栈的入栈序列是a，b，c，d，e则栈的不可能的输出序列是：（C）
     *   A、edcba     B、decba      C、dceab       D、abcde
     *   *入栈的时候同时是可以按顺序出栈的，所以只有C错误。
     *   （d出来之后栈中有cba需要按顺序出或者进栈e，如果进栈e那么栈中是ecba。现在先出栈c，然后进栈e，栈中只有eba，只能按先进后出的数据结构出栈）
     */

}
