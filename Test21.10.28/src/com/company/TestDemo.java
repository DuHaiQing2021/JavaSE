package com.company;

import java.util.Arrays;

public class TestDemo {
        //库函数调用
        public static void main1(String[] args) {
            int[] array1 = new int[10];
            int[] array2 = new int[10];
            int[] array3 = {1,50,23,10,5,98,66,5,22,0};

            Arrays.fill(array1,2,8,90); //以值为90填充数组的2到8之间（不包括8下标）的值
            Arrays.fill(array2,90);   //以90填充数组
            Arrays.sort(array3);  //排序数组

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.toString(array3));
        }

        public static void main(String[] args) {
            int[] array={5,1,5,1,61,3};
            int[] copy = Arrays.copyOf(array,array.length);//返回一个拷贝数组
            int[] clone = array.clone();  //克隆一个数组
            //区别是Arrays.copyOf速度更快，所以经常用copy。
            array[0]=99;
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(copy));
            System.out.println(Arrays.toString(clone));
        }

    }

