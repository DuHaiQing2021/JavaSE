package com.company;

class Node {
    public int val;
    public Node next;

    public Node(int val){
        this.val=val;
    }


}
public class MyQueue {
    public Node head;
    public Node last;

    public void offer(int val){
        Node node=new Node(val);
        if (this.head==null){
            this.head=node;
            this.last=node;
        }else{
            last.next=node;
            last=last.next;
        }

    }
}
