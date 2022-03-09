package com.company.demo;

/**
 * 异常
 *当try中发生异常了之后，你要在对应的catch里面，捕捉对应的异常。
 *如果你没有捕捉这个异常，那么就会交给JVM处理，一旦交给JVM处理，程序立马终止了。
 *
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] array={1,2,3};
        try {
            System.out.println(array[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("处理数组下标异常！");
        }
//        System.out.println("哈喽！！");


    }
    public static void main1(String[] args) {

        //1.ArithmeticException算术异常
//        System.out.println(10/0);

        //2.NullPointerException空指针异常
//        String str=null;
//        System.out.println(str.length());

        //3.ArrayIndexOutOfBoundsException数组下标异常
//        int[] array={1,2,3};
//        System.out.println(array[5]);

    }

}
