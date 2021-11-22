package com.j2se.innerclass;

public class OuterClass2 {
    private String name;
    private static String sname="我是外部类的静态的成员变量";
    public void method(){
        InnerClass ic=new InnerClass();
        System.out.println("我是外部类的成员方法");
        //外部类的访问内部类的成员变量
        System.out.println("age="+ic.age);
        //外部类访问内部类的成员方法
        ic.innerMethod();
        InnerClass.staticInnerMethod();
    }

    public static void staticMethod() {
        System.out.println("我是外部类的静态成员方法");
    }
    //静态内部类
    public static class InnerClass{
        private int age=10;
        public static String isname="我是内部类的静态成员变量";
        public void innerMethod(){
            System.out.println("我是内部类的成员方法");
            System.out.println("sname="+sname);
            staticMethod();
        }
        public static void staticInnerMethod(){
            System.out.println("我是外部类的静态成员方法");
        }
    }

    public static void main(String[] args) {
        OuterClass2 outerClass2=new OuterClass2();
        outerClass2.method();
        OuterClass2.staticMethod();
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
        OuterClass2.InnerClass.staticInnerMethod();

    }
}
