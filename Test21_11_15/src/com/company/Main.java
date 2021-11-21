package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        //测试是否添加
        myArrayList.add(0,12);
        myArrayList.add(1,51);
        myArrayList.add(2,2);
        myArrayList.add(3,34);
        myArrayList.add(4,26);
        myArrayList.display();
        //测试是否能完成确定元素在列表里
        System.out.println("----测试是否能完成确定元素在列表里----");
        boolean flag=myArrayList.contains(2);
        System.out.println(flag);
        //测试是否能完成确定元素位置
        System.out.println("----测试是否能完成确定元素位置----");
        int weizhi=myArrayList.search(51);
        System.out.println(weizhi);
        //测试是否能完成给出该位置的元素
        System.out.println("----测试是否能完成给出该位置的元素----");
        int val=myArrayList.getPos(3);
        System.out.println(val);
        System.out.println(myArrayList.getPos(6));
        //测试是否能完成删除该关键字元素
        System.out.println("-----测试是否能完成删除该关键字元素----");
        myArrayList.remove(2);
        myArrayList.display();
        //测试是否能完成该位置元素的设置
        System.out.println("测试是否能完成该位置元素的设置");
        myArrayList.setPos(3,28);
        myArrayList.display();
        //测试是否清空顺序表
        System.out.println("测试是否清空顺序表");
        myArrayList.clear();
        myArrayList.display();








    }
}
