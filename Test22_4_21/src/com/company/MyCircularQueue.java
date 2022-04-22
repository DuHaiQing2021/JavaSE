package com.company;

/**
 * 设计循环队列
 */
public class MyCircularQueue {

    public int[] elem;
    public int front;
    public int rear;
    public MyCircularQueue(int k) {
        this.elem=new int[k+1];
    }

    public boolean enQueue(int value) {
        if (isFull()){
            return false;
        }
        elem[rear]=value;
        rear=(rear+1)%elem.length;
        return true;

    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }
//        elem[front]=0;//业务上的处理
        front=(front+1)%elem.length;
        return true;
    }

    public int Front() {
        if (isEmpty()) {return -1;}
        return elem[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        int index=-1;
        if (rear==0){
            index=elem.length-1;
        }else {
            index=rear-1;
        }
        return elem[index];
    }

    public boolean isEmpty() {
        if (front==rear){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((this.rear+1)%this.elem.length==front){
            return true;
        }
        return false;
    }
}
