package com.company;

class OuterClass{
    public int data1=1;
    private int data2=2;
    public static int data3=3;

    //实例内部类
    //可以当作一个实例的成员
    class InnerClass{

        public int data4=4;
        private int data5=5;
//        public static int data6=6;//error 不可以定义内部类的静态成员变量。静态的成员变量这是属于类的，不属于对象。
        public static final int DATA7=7;//true 可以定义内部类的静态成员常量

        public int data1=9999;//于外部类同名成员变量
        public void test(){
            System.out.println(this.data1);//自己的this
            System.out.println(OuterClass.this.data1);//外部类的this
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(DATA7);

            System.out.println("InnerClass::test()");
        }

        public InnerClass(){
            System.out.println("不带参数的内部类的构造方法");
        }
    }

    public void func1(){
        System.out.println("OuterClass::func1()");
    }

}



public class TestDemo {
    public void func(){
        //本地内部类
        class Test{
            public int a;
        }
    }
    public static void main(String[] args) {

        //实例内部类的定义1
        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass1=outerClass.new InnerClass();
        //实例内部类的定义2
        OuterClass.InnerClass innerClass2=new OuterClass().new InnerClass();
        //调用
        innerClass1.test();
        innerClass2.test();

    }

}
