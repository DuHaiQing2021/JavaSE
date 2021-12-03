package com.company.bite;

import com.company.Coure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        /**
         * ArrayList实现类,接口为List
         * 特点:可以存放重复数据,有序存放
         */
        //1.创建对象
        List<Coure> list1=new ArrayList<>();//初始化空列表,容量为0
//        List<String> list2=new ArrayList<>(5);//初始化列表,容量5
        //2.增加:
        Coure coure1=new Coure("java","66");
        Coure coure2=new Coure("html","60");
        Coure coure3=new Coure("c#","75");
        Coure coure4=coure2;
        list1.add(coure1);
        list1.add(coure2);
        list1.add(coure3);
        list1.add(0,coure4);
        System.out.println(list1);
        //3.set()和get()
        System.out.println(list1.get(2));
        list1.set(2,new Coure("sql","55"));
        System.out.println(list1);
        //4.remove
        System.out.println(list1.remove(1));
        //5.size()
        System.out.println("集合的长度:"+list1.size());
        //6.遍历
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (Coure c : list1) {
            System.out.println(c);
        }
        Iterator<Coure> cour=list1.listIterator();
        while (cour.hasNext()){
            System.out.println(cour);
        }

    }
}
