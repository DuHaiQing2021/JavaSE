package com.company.demo1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 字符串2
 *
 */
public class TestDemo1 {


    public static void main(String[] args) {
        //将字节变成字符串
        byte[] bytes=new byte[]{67,66,99,102};
        String str=new String(bytes,1,3);
        System.out.println(str);
        System.out.println("=======================");
        //将字符串变成字节
        String str2="abcd";
        byte[] bytes1=str2.getBytes();
        System.out.println(Arrays.toString(bytes1));
    }
    //判断字符串是不是一个数字字符串
    public static boolean isNumberChar(String s){
//        //方法1
//        for (int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if (c<'1'||c>'9'){
//                return false;
//            }
//        }
//        return true;
        //方法2
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            boolean flg=Character.isDigit(c);
            if (flg==false){
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str="1234567";
        System.out.println(isNumberChar(str));
    }
    public static void main1(String[] args) {
        //将字符数组转换为字符串
        char[] val1={'a','b','c'};
        String str1=new String(val1);
        System.out.println(str1);
        char[] val2={'a','b','c','d','f'};
        String str2=new String(val2,1,3);
        System.out.println(str2);


        //取出字符串中的单个字符
        String str3="hello";
        char ch=str3.charAt(2);
        System.out.println(ch);

        //将字符串变成数组
        char[] chars=str3.toCharArray();//把str3指向的字符串对象，变成字符数组
        for (char i: chars) {
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
