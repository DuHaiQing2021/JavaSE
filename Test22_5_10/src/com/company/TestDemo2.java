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

        public OuterClass2 out=new OuterClass2();

        public void test(){
            System.out.println(out.data1);
            System.out.println();
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
        OuterClass2.InnerClass innerClass=new OuterClass2.InnerClass();
        innerClass.test();
    }
}
