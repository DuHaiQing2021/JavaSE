package com.company.bite;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Dog> list=new ArrayList<>();
        Dog dog1=new Dog("小七","柯基");
        Dog dog2=new Dog("小八","拉布拉多");
        Dog dog3=new Dog("小九","金毛");
        Dog dog4=new Dog("小十","吉娃娃");

        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);
        System.out.println("共计有"+list.size()+"条狗狗");

        System.out.println("分别是:");
        for (Dog dog:list) {
            System.out.println(dog);
        }
        System.out.println("第一条狗狗的呢称:"+list.get(0).getName());
        System.out.println("最后一条狗狗的呢称:"+list.get(3).getName());
        System.out.println("集合中是否包含小八:"+Test1.isContain("小七",list));
        list.remove(dog1);
        list.remove(dog2);
        System.out.println("删除部分狗狗后还有"+list.size()+"条狗狗");
        for (Dog dog:list) {
            System.out.println(dog);
        }

    }

    public static boolean isContain(String name,List<Dog> list) {
        for (Dog d:list) {
            if (d.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}