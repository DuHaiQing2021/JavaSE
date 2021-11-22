package com.j2se.innerclass;

public class OuterClass3 {
    public static void main(String[] args) {
        Foo foo=new Foo() {
            @Override
            public void test() {
                System.out.println("我是匿名内部类的方法");
            }
        };
        foo.test();
        Coo1 coo1=new Coo1(){
            @Override
            void test1() {
                System.out.println("我是父类方法--test1");
            }
        };
        coo1.test1();
        Coo2 coo2=new Coo2(){
            @Override
            void test2() {
                System.out.println("我是父类方法--test2");
            }
        };
        coo2.test2();
    }
}
interface Foo{
    void test();
}
class Coo1{
    void test1(){
        System.out.println("我是父类的方法");
    }
}
class Coo2{
    void test2(){
        System.out.println("我是父类的方法");
    }
}