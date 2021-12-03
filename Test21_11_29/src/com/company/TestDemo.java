package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TestDemo {

    public static void main(String[] args) {

//        test1();
        test2();

    }
    //Collection接口：使用String作为泛型，测试方法
    public static void test1() {
        /**
         * collection根接口
         *      1.创建对象，接口无法创建对象，必须通过子实现类创建对象
         *      2.增加：add（）、addAll（）
         *      3.删除：remove（）、removeAll（）、clear（）
         *      4.查找：contains（）、
         *      5.判空和获取长度：isEmpty（）和size（）
         */
        Collection<String> col1 = new ArrayList<>();
        Collection<String> col2=new ArrayList<>();
        //增加：add()和addAll()
        col1.add("aaaa");
        col1.add("bbbb");
        col1.add("cccc");
        col2.add("dddd");
        col2.add("eeee");
        System.out.println(col2);
        col1.addAll(col2);
        System.out.println("集合col1对象："+col1);
        //删除：remove（）和removeAll（）,将所有元素删除：clear（）
        col1.remove("aaaa");
        System.out.println("查看col1是否删除元素"+col1);
        col1.removeAll(col2);
        System.out.println("查看剩余那些元素"+col1);
        //判空：isEmpty（）
//        col1.clear();
        System.out.println("col1集合是否为空："+col1.isEmpty());
        System.out.println(col1);
        //判断是否包含：contains（）和containsAll（）
        System.out.println("col1是否包含bbb："+col1.contains("bbb"));
        System.out.println("col1是否包含col2的元素："+col1.containsAll(col2));
        //获取集合的长度：size（
        System.out.println("集合的长度："+col1.size());
        //转成数组：toArray（）
        System.out.println("将col1转换成数组：");

//
//        col1.removeAll(col2);
//        System.out.println(col2);
    }
    //Collection接口：使用Coure自定义类作为泛型，测试方法
    public static void test2() {
        Collection<Coure> coures=new ArrayList<>();
        Coure coure1=new Coure("java","66");
        Coure coure2=new Coure("html","60");
        Coure coure3=new Coure("c#","75");
//        System.out.println(coure1);
        //增加
        coures.add(coure1);
        coures.add(coure2);
        coures.add(coure3);
        System.out.println(coures);
        //删除
//        coures.remove(coure1);
//        coures.clear();
        //包含
//        System.out.println(coures.contains(coure2));
        //判空
//        System.out.println(coures.isEmpty());
        //获取大小

        /**
         * 1.使用普通for循环遍历
         * 2.使用增强for循环遍历
         * 3.使用迭代器循环遍历
         */
        Object[] cobj=coures.toArray();
        for (int i = 0; i < coures.size(); i++) {
            //暂时无法直接获取集合中的单个对象,可以通过数组来进行遍历
            System.out.println(cobj[i]);
        }

        for (Coure coure :coures) {
            System.out.println(coure);
        }
        //迭代器
        Iterator<Coure> cours =coures.iterator();
        while(cours.hasNext()){
            Coure c=cours.next();
            System.out.println(c);
        }
    }
    //
    public static void test3(){

    }
}
