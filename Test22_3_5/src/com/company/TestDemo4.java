package com.company;

interface IA {
    //成员变量默认是public static final
    public static final int NUM=10;
    void funcA();//抽象方法，接口中默认方法是abstract。
}
interface IB extends IA{
    void funcB();
}
class Aia implements IB {
    public void funcA(){
        System.out.println("funcA()");
        System.out.println(NUM);
    }
    public void funcB(){
        System.out.println("funcB()");
    }
}
public class TestDemo4 {

    public static void main(String[] args) {
        final int A=10;
        System.out.println(A);
    }

}
