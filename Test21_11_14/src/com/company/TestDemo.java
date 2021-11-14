package com.company;


public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(1,51);
        myArrayList.add(2,45);
        myArrayList.add(3,5);
        myArrayList.add(4,33);
        myArrayList.display();
        myArrayList.setPos(1,15);
        myArrayList.display();

    }


}
