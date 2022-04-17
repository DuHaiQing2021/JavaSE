package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestDemo {

    public static void main(String[] args) {
        //可以定义顺序表容量
        ArrayList<String> list2= new ArrayList<>(10);

        //对顺序表进行存放
        list2.add("hello");
        list2.add("zhang");
        list2.add("zhjh");

        System.out.println("========使用迭代器进行打印============");
        ListIterator<String> it= list2.listIterator();
        while (it.hasNext()){
            String ret=it.next();
            if (ret.equals("hello")){
                it.remove();
            }else{
                System.out.println(ret);
            }
        }
    }
    /**
     * 对顺序的基本操作
     * @param args
     */
    public static void main1(String[] args) {
        //可以使用向上转型
        List<String> list = new ArrayList<>();

        //可以定义顺序表容量
        ArrayList<String> list2= new ArrayList<>(10);

        //对顺序表进行存放
        list2.add("hello");
        list2.add("zhang");
        list2.add("zhjh");

        //打印顺序表
        System.out.println("==============直接打印=============");
        System.out.println(list2);

        System.out.println("==============for遍历打印=============");
        for (int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }

        System.out.println("=======foreach对顺序表进行打印========");
        for (String i:list2) {
            System.out.println(i);
        }

        System.out.println("========使用迭代器进行打印============");
        Iterator<String> it= list2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("========使用迭代器List进行打印============");
        ListIterator<String> it2= list2.listIterator();

        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
