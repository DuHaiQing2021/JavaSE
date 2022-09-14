package com.company;

class OuterClass2{
    public int data1=1;
    private int data2=2;
    public static  int data3=3;

    //静态内部类：
    static class InnerClass{
        public int data4=4;
        private int data5=5;
        public static int data6=6;

        //1.定义一个外部类对象，来找外部类中的属性
        public OuterClass2 out=new OuterClass2();


        //2.在内部类创建一个带外部类参数的构造方法
        public InnerClass(OuterClass2 out2){
            this.out=out2;
        }

        public InnerClass(){ ; }

        public void test(){
            System.out.println(out.data1);
            System.out.println(out.data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println("InnerClass::test())");
        }

    }

}

public class TestDemo2 {
    public static void main(String[] args) {
        OuterClass2.InnerClass innerClass=new OuterClass2.InnerClass(new OuterClass2());
        OuterClass2.InnerClass innerClass1=new OuterClass2.InnerClass();
        innerClass.test();
    }
}
