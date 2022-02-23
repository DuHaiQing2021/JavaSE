package com.bite.demo;

public class TestDemo2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
//        myLinkedList.createList();
//        myLinkedList.addFirst(56);
//        myLinkedList.addFirst(22);
//        myLinkedList.addFirst(6);
//        myLinkedList.addFirst(23);
//        myLinkedList.addFirst(18);
        myLinkedList.addLast(11);
        myLinkedList.addLast(51);
        myLinkedList.addLast(91);
        myLinkedList.addLast(21);
        myLinkedList.addLast(30);
        myLinkedList.addIndex(5,20);
        myLinkedList.addIndex(0,35);
        myLinkedList.addIndex(8,6666);
        myLinkedList.remove(51);
        myLinkedList.remove(35);
        myLinkedList.remove(20);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(0));
        System.out.println(myLinkedList.size());

    }
}
