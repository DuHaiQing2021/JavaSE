package com.company.demo1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/**
 * 字符串2
 *
 */
public class TestDemo1 {
    //把字符串里的内容大小写转换
    public static void main(String[] args) {
        String str="abcdeABCDfsf";
        String string=str.toLowerCase();
        String string2=str.toUpperCase();
        System.out.println(string);
        System.out.println(string2);
    }
    //取出字符串
    public static void main9(String[] args) {
        String str="abcdeeafsf";
        String string=str.substring(2,4);//取出2到3位置上的字符串，不包括4位置上的。
        System.out.println(string);

    }
    /**
     * 注意
     * 1.字符”|“，”*“，”+“都的加上转义字符，前面加上”\“
     * 2.而如果是“.”前面加上“\\”
     * 3.如果一个字符串中有多个分隔符，可以使用“|”作为连字符。
     * @param args
     */
    public static void main8(String[] args) {

        String str="192.156.11.1";
        //String[] strings=str.split(".");
        String[] strings=str.split("\\.");
        String[] strings2=str.split("\\.",2);

        for (String i:strings) {
            System.out.println(i);
        }
        for (String n:strings2) {
            System.out.println(n);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        String str2="192\\45\\66";//  "\\"两个斜杠表示一个斜杠
        String[] strings1=str2.split("\\\\");//两个斜杠表示一个斜杠
        for (String x:strings1) {
            System.out.println(x);
        }
    }

    //把字符串进行分割
    public static void main7(String[] args) {
        String str="name=zhangsan&age=18";
        String[] s=str.split("&");
        for (String i:s) {
            String[] ss=i.split("=");
            for (String i1:ss){
                System.out.print(i1+" ");
            }
            System.out.println();
        }
    }


    //对字符串中的字符进行替换
    public static void main6(String[] args) {
        String str="abcdeeafsf";
        String ret=str.replace("ee","ab");
        System.out.println(ret);
        String ret2=str.replaceAll("ee","12");
        System.out.println(ret2);

    }


    //查看字符串是否包含另一个子字符串
    public static void main5(String[] args) {
        //方法1
        String str="sddfgha";
        String str2="ddf";
        String str3="fh";
        boolean flg=str.contains(str2);//看字符串是否包含子字符串，包含返回一个布尔类型true，否则返回false
        boolean flg2=str.contains(str3);
        System.out.println(flg);
        System.out.println(flg2);

        //方法2
        int index=str.indexOf(str2);//查看字符串中子字符串出现的位置，子字符串存在，返回子字符串出现在字符串中第一个元素下标。
        int index2=str.indexOf(str3);//如果子字符串不在该字符串中，则返回一个-1.表示子字符串不存在。
        int index3=str.lastIndexOf(str2);//从字符串最后位置开始找
        boolean index4=str.startsWith("d",2);//从字符串中的第2位置开始找“d”字符串。
        System.out.println(index);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
    }

    public static void main4(String[] args) {
        String str1="abc";
        String str2="AcC";
        //比较两个字符串首字符大小
        System.out.println(str1.compareTo(str2));

        //比较字符串内容是否相等
        System.out.println(str1.equals(str2));

    }
    public static void main3(String[] args) {
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

    //判断是不是数字字符串
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
