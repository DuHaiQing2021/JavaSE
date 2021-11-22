package com.j2se.innerclass;

public class OuterClass {
    private String name;
    private int age;


    //成员方法
    public void outerTest(final int num){//num不能被修改，所以final可加可不加
        int x=20;//局部变量
        //局部内部类
        class InnerClass{
            int n=1; //内部类的属性
            private String str ="我是内部类的成员变量";
            //构造内部类
            public  InnerClass(){
                name="小马";
                age=35;
                //局部内部类访问局部变量（临时变量）时，该变量为final修饰的变量
                //num=10;
                n=10;
//                x=10;

            }
            //内部类可以访问外部类的成员
            public void innerTest(){
                System.out.println("name="+name+",age="+age+",num="+num);
                System.out.println(OuterClass.this.name);//访问外部类的属性
                System.out.println("我是内部类的成员方法");
            }
        }
        //创建局部内部类对象
        InnerClass innerClass=new InnerClass();
        System.out.println(innerClass.str);
        innerClass.innerTest();
    }

    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.outerTest(10);
    }
}
