package com.company;

import sun.java2d.pipe.ShapeSpanIterator;

/**
 * 1.包含抽象方法的类，叫做抽象类
 * 2.什么是抽象类，一个没有具体实现的方法，被abstract修饰。
 * 3.抽象类是不可以被实例化的.
 * 4.因为抽象类不能被实例化，所以只能被继承。
 * 5。抽象类当中，也可以包含，和普通类一样的成员和普通方法.
 * 6.一个普通类继承了抽象类，那么必须重写抽象类中的所有抽象方法方法。
 * 7.抽象类的最大作用，就是为了被继承。
 * 8.一个抽象类，如果继承了一个抽象类B，那么这个抽象类A,可以不实现抽象父类B的抽象方法。
 * 9.结合第8点，当A类再次被一个普通类继承后，那么A和B这两个抽象类当中的抽象方法，必须被重写
 * 10.抽象类 不能被final修饰，抽象方法也不可以被final修饰。因为抽象类是被重写的，final修饰的方法不能被修改，所以报错。
 */
abstract class A extends Shape{

}
abstract class Shape{
    private int a;
    //抽象方法的实现:9
    public abstract void drow();
    //这个方法一直被重写，所以里面的方法没有实现。可以用抽象方法来修饰。
    public void drow1(){
        System.out.println("shape：drow()");
    }
}
class Rect extends Shape{
    @Override
    public void drow(){
        System.out.println("这是一个方片！");
    }
    public void drow1(){
        System.out.println("这是drow1的方片！");
    }

}
class Flower extends Shape{

    @Override
    public void drow(){
        System.out.println("这是一朵花！");
    }
    public void drow1(){
        System.out.println("这是drow1的花！");
    }
}

/**
 * 多态的表现形式
 */
public class TestDemo2 {

    //抽象类可以发生动态绑定（多态）
    public static void main(String[] args) {
        Rect rect=new Rect();
        Flower flower=new Flower();
        Shape shapes[]=new Shape[]{rect,flower,rect,rect};
        for (Shape i:shapes){
            i.drow();
        }

    }
    //打法3
    public static void main3(String[] args) {
        Rect rect=new Rect();
        Flower flower=new Flower();
        Shape shapes[]={rect,flower,rect,flower};
//        Shape shapes[]=new Shape[]{rect,flower};
        for (Shape i: shapes) {
            i.drow();
        }
    }

    //方法2
    public static void drowMap(Shape shape){
        shape.drow();
    }
    public static void main2(String[] args) {
        drowMap(new Rect());
        drowMap(new Flower());
    }
    //方法1
    public static void main1(String[] args) {
        Shape shape=new Rect();
        shape.drow();

        Shape shape1=new Flower();
        shape1.drow();
    }

}