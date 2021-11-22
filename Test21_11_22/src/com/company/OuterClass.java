package com.company;

//外部类
public class OuterClass {
    private String name;
    private int age;

    //成员内部类
    public  class InnerClass{
        private String str ="我是内部类的成员变量";
        //内部类可以访问外部类的成员
        public  InnerClass(){
            name="小马";
            age=35;
        }
        public void innerTest(){
            System.out.println("我是内部类的成员方法");
            //访问外部类的成员方法
            outerTest();
        }
    }
    //外部类的成员方法可以访问内部类的成员
    public void outerTest(){
        InnerClass ic=new InnerClass();
        System.out.println("str="+ic.str);
//        System.out.println("name="+);
//        ic.innerTest();
        System.out.println("我是外部类的成员方法");
    }

    public static void main(String[] args) {
        //外部类的对象
        OuterClass outerClass=new OuterClass();
        //调用外部类的成员方法
        outerClass.outerTest();

        //内部类的对象
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
//        OuterClass.InnerClass innerClass1=new OuterClass().new InnerClass();
        //调用内部类的成员方法
        innerClass.innerTest();
    }

}
