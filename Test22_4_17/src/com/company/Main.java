package com.company;

public class Main {

    public static void main(String[] args) {
        Integer a=Integer.valueOf(123);//使用ctrl加左键可以查看Integer类中valueOf这个方法存放的原理；
        Integer b=123;//默认使用Integer.valueOf这个方法进行存储。
        System.out.println(a == b);//因为没有超过-128到127之间的范围所以没有new，当然是true

        Integer a1=129;
        Integer b1=129;
        System.out.println(a1 == b1);//因为超过范围所以new了，当然是false
    }
    //装箱装包
    //包装类Integer 、Character重点记忆，其他都是简单数据类的大写开头变成包装类
    public static void main2(String[] args) {

        Integer a=123; //装包、装箱；将123整数装进包装Integer整形类里面[隐式的]
        int b=a;//拆箱、拆包；将整数类a放进基础数据整形类中【隐式的】
        //什么叫隐式的装拆包，意思是123是经过了Integer.valueof转换成Integer的。
        System.out.println(a+" "+b);


        Integer a2=Integer.valueOf(123);
        Integer a3=new Integer(123);//[显示的]装箱
        System.out.println(a3);

        int b2=a2.intValue();
        double d=a2.doubleValue();  //【显示的】拆箱
        System.out.println(b2 +" "+d);

    }
    public static void main1(String[] args) {
	// write your code here
        //将字符串变成整数
        String str="123";
        int a=Integer.parseInt(str);
        System.out.println(a+1);

        //将整数变成字符串
        int a2=1234;
        String str2=Integer.toString(a2);
        System.out.println(str2);

    }
}
