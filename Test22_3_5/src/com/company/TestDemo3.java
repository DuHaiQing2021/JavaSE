package com.company;

/**
 * 接口
 * 1.使用interface来修饰的。interface IA{}
 * 2.接口当中的方法，不能有具体的实现。如果非要实现只能通过关键字default来修饰这个方法。
 * 3.接口当中，可以有 static 的方法。
 * 4.里面的所有的方法都是public的。
 * 5.抽象方法，默认是public abstract的。
 * 6.接口是不可以通过关键字new来实现的。
 * 7.类和接口之间的关系是通过关键字implements。
 * 8.当一个类实现了一个接口，就必须要重写接口中的抽象方法。
 * 9.接口当中的成员变量，默认是public static final修饰的。
 * 10.当一个类实现这个接口之后，重写这个方法的时候，这个方法前面必须加上public。
 * 11。一个类可以通过关键字extends继承一个抽象类或者一个普通类，但是只能继承一个类。同时，也可以通过implements实现多个接口。接口之间使用逗号
 * 隔开。
 * 12.接口被实现的时候可以发生多态及动态绑定。也可以向上转型。
 * 接口的优点是让程序员忘记类型，有了接口之后，类的使用者就不必关注具体的类型，而只关注某个类是否具备的某种能力。
 *
 */

interface Ishape{
    public abstract void drow();//抽象方法
    default public void func(){
        System.out.println("被default修饰的这个方法不能被重写");
    }
    default public void func1(){
        System.out.println("多个普通方法");
    }
    public static void funcStatic(){
        System.out.println("接口当中，可以有 static 的方法。");
    }
    public void drow1();//在接口中就算没有加abstract也是抽象方法，除非使用

}
class Drow implements Ishape{

    @Override//重写drow方法
    public void drow() {
        System.out.println("⚪");
    }
    @Override //也可以重写func方法
    public void func(){
        System.out.println("这是重写接口中的default修饰的方法");
    }

    @Override
    public void drow1() {
        System.out.println("▲");
    }
}
public class TestDemo3 {

    public static void main(String[] args) {
    }

}
