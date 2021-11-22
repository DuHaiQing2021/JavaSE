package com.company;

public class TestDemo  {
    public static void main(String[] args) {
        acterLinkedList linkedList=new acterLinkedList();
//        linkedList.creatNode();
//        System.out.println("测试是否能完成头插法");
//        linkedList.addFirst(12);
//        linkedList.addFirst(55);
//        linkedList.addFirst(16);
//        linkedList.addFirst(32);
//        linkedList.addFirst(11);
//        linkedList.display();
//        System.out.println("测试是否能完成尾插法");
//        linkedList.addLast(12);
//        linkedList.addLast(56);
//        linkedList.addLast(8);
//        linkedList.addLast(33);
//        linkedList.addLast(21);
//        linkedList.addLast(11);
////
//        linkedList.display();
        System.out.println("测试是否能在输入位置添加元素");
        linkedList.addIndex(0,1);
        linkedList.addIndex(1,54);
        linkedList.addIndex(2,5);
        linkedList.addIndex(3,11);
        linkedList.display();
//        System.out.println("测试能否移除当前元素节点");
//        linkedList.remove(12);
//        linkedList.remove(33);
//        linkedList.remove(11);
//        linkedList.remove(0);
//        linkedList.display();
//        linkedList.removeAllKey(12);
//        linkedList.display();
//        int count=linkedList.size();
//        System.out.println(count);
//        int count=linkedList.size();
//        boolean flg=linkedList.contains(11);
//        System.out.println(count);
//        System.out.println(flg);



    }


}
