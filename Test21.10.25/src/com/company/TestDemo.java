package com.company;

import java.sql.Array;
import java.util.Arrays;

public class TestDemo {
    /**
     * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
     */
    public static  int[] copyof(int[] arr){
        int[] arr_1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_1[i]=arr[i];
        }
        return arr_1;
    }
    public static void main1(String[] args) {
        int[] arr={5,12,56,11,32,56,6};
        int[] arr_1=copyof(arr);
        for (int x:arr_1) {
            System.out.print(x+" ");
        }
    }
    /**
     * 实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
     * 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
     */
    public static String toString(int[] arr) {
        String args="[";
        int i=0;
        for (i = 0; i < arr.length; i++) {
            args+=arr[i];
            if (i != arr.length-1) args+=",";
        }
        args+="]";
        return args;
    }

    public static void main2(String[] args) {
        int[] arr={5,4,85,6,1,2,0};
        String arr1=toString(arr);
        System.out.println(arr1);
    }

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，
     * 其余每个元素均出现两次。找出那个只出现了一次的元素。
     */
    public static int fund(int[] arr) {
        int num=0;
        for (int x:arr) {
            num^=x;
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,1,5,6,6};
        String arr1= Arrays.toString(arr);
        System.out.println("输入："+arr1);
        int n=fund(arr);
        System.out.println("输出："+n);
   }
}
