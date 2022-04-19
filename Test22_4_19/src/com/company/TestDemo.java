package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestDemo {
    //使用顺序表对象进行存储
    public static void main1(String[] args) {
        ArrayList<StudentTest> arrayList=new ArrayList<>();
        
        StudentTest student1=new StudentTest("张三","1班",85.0);
        StudentTest student2=new StudentTest("李四","1班",55.0);
        StudentTest student3=new StudentTest("王三","1班",65.0);
        
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        for (StudentTest s:arrayList) {
            System.out.println(s);
        }
        
    }

    //删除第一个字符串当中出现的第二个字符串中的字符
    //例如：String str1=“welcome to bit”；
    //     String str2=“come”；
    //输出：wl t bit
    //方法1
    public static StringBuilder func1(StringBuilder str1) {
        String str2="come";
        for (int i = 0;i < str2.length();i++) {
            char a=str2.charAt(i);
            for (int j=0;j<str1.length();j++){
                char b=str1.charAt(j);
                if (a==b){
                    str1.deleteCharAt(j);
                }
            }
        }
        return str1;
    }
    //方法2
    public static void main(String[] args) {
//        StringBuilder str1=new StringBuilder("welcome to bit");
//        StringBuilder s=func1(str1);
//        System.out.println(s);

        ArrayList<Character> list=new ArrayList<>();
        String str1="welcome to bit";
        String str2="come";

        for (int i=0;i<str1.length();i++){
            char a=str1.charAt(i);
            if (!str2.contains(a+"")){
                list.add(a);
            }

        }
        for (char ch:list){
            System.out.print(ch);
        }
        System.out.println();

    }


    //使用顺序表的排序方法Collections.sort对顺序表进行排序
    public static void main3(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(55);
        list.add(22);

        Collections.sort(list);//对顺序表进行排序
        System.out.println(list);
    }
}
