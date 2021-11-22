package com.j2se.exceptiontest;

public class ExceptionTest1 {
    public static void main(String[] args) {

        //ArithmeticException数学运算异常
        //浮点数除0结果为正负Infinity，不会报错！
//        System.out.println(-10.0/0);
//        System.out.println("main方法结束！");

        //OutOfMemoryError内存溢出
//        int[] arr=new int[100*1024*1024];

        /**
         * 捕获异常：try，catch，finally
         * try{
         *     可能会发生异常的代码块
         * }catch(异常类型 异常对象){
         *     处理异常的代码块
         * }
         *
         */

//        try{
//            System.out.println("main方法开始！");
//            System.out.println(10/0);
//            System.out.println("main方法结束！");
//        }catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            System.out.println("除0异常已经被处理！");
//        }finally {
//            System.out.println("我总会执行");
//        }
//        System.out.println("main方法真的结束了");

        //throw抛出异常处理
        ExceptionTest1 et1=new ExceptionTest1();
        try {
            et1.divTest(10,0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("除0异常已经被处理");
        }
    }

    public void divTest (int x,int y) throws Exception {
        if (y==0){
            //发生异常，向外抛异常
            throw new Exception();
        }
        System.out.println("x/y="+x/y);
    }
}
