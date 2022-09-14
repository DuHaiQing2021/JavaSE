package com.company;

class Class3{
    public int data1=1;
    private int data2=2;
    public static  int data3=3;

    public void test(){
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }

}

public class TestDemo3 {
    public static void main(String[] args) {
        //匿名内部类1
        new Class3(){}.test();

        //匿名内部类2
        new Class3(){
            @Override
            public void test() {
                System.out.println("重写的test方法");
            }
        }.test();
    }
}

