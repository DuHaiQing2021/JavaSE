package com.company;

public class TestDemo  {
    public static void main(String[] args) {
        acterLinkedList linkedList=new acterLinkedList();
//        linkedList.creatNode();
//        linkedList.addFirst(12);
//        linkedList.addFirst(55);
//        linkedList.addFirst(16);
//        linkedList.addFirst(32);
//        linkedList.addFirst(11);
        linkedList.addLast(12);
        linkedList.addLast(51);
        linkedList.addLast(12);
        linkedList.addLast(33);
        linkedList.addLast(12);
        linkedList.addLast(12);
//        linkedList.addIndex(0,1);
//        linkedList.addIndex(2,54);
//        linkedList.addIndex(8,5);
//        linkedList.addIndex(5,11);
//        linkedList.remove(12);
//        linkedList.remove(0);
//        linkedList.remove(33);
//        linkedList.remove(11);
        linkedList.removeAllKey(12);
        linkedList.display();
        int count=linkedList.size();
        System.out.println(count);
//        int count=linkedList.size();
//        boolean flg=linkedList.contains(11);
//        System.out.println(count);
//        System.out.println(flg);



    }


}
