package com.bit.test;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>() ;

        map.put("2", "songjiang");
        map.put("1", "zhang");


        //将主键key“1”和“2”进行组装放进Set里面
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for (Map.Entry<String,String> entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }



    }
    public static void main3(String[] args) {
        Map<String,String> map=new HashMap<>();
        //存放
        map.put("1","zhang");
        map.put("2","songjiang");
        //获取
        String name=map.get("1");
        System.out.println(name);
        //根据给定的key查找对应的value，如果有返回，如果没有用默认值取代
        String name2=map.getOrDefault("1","zhangsan");
        System.out.println(name2);
        String name3=map.getOrDefault("12","zhangsan");
        System.out.println(name3);

        //确认HashMap中是否有key或者value，有返回true，没有false。
        boolean flag=map.containsKey("1");
        System.out.println(flag);
        boolean flag2=map.containsKey("5");
        System.out.println(flag2);
        boolean flag3=map.containsValue("zhang");
        System.out.println(flag3);



    }
    public static void main2(String[] args) {
        Collection<String> collection=new ArrayList<String>();
        collection.add("fdlf");
        collection.add("hello world");
        System.out.println(collection);
        System.out.println("================");



    }
    public static void main1(String[] args) {
        //如果没有泛型指定那什么类型的数据都可以放
        Collection collection=new ArrayList();
        collection.add("hello world");
        collection.add(1);

        //指定类型
        Collection<String> collection2=new ArrayList<String>();
        collection2.add("dfds");
//        collection2.add(1); //类型存放错误

        //尖括号里面只能放类类型 ，不能放简单的基本数据类型
        Collection<Integer> collection3=new ArrayList<Integer>();
        collection3.add(1);
    }
}
