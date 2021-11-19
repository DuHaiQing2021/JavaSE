package com.company;

import java.util.Arrays;

/**
 * String类型
 */
public class TestDemo {
    public static void main(String[] args) {
        String str1="hello";


    }
    public static void func(String str, char[] array) {
        str="ssafsfsf";//改变了指向，指向“ssafsfsf”
        array[0]='f';// 改变了指向原数组位置的值
    }
    public static void main2(String[] args) {
        String str="dafa";
        char[] array={'a','a','s'};
        func(str,array);
        System.out.println(str);
        System.out.println(Arrays.toString(array));
    }
    public static void main1(String[] args) {
        //方式一
        String str1="djfkda";
        //方式二
        String str2= new String("sdffdf");
        //方式三
        char[] str={'s','c','s','d'};
        String str3= new String(str);


    }

}
