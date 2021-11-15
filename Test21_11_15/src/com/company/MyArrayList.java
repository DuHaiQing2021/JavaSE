package com.company;

import java.util.Arrays;

public class MyArrayList{
    public int[] val;
    public int userSize;//有效个数
    public MyArrayList(){
        this.val=new int[10];
    }
    // 打印顺序表
    public void display() {
        for (int i=0;i<this.userSize;i++){
            System.out.print(this.val[i]+" ");
        }
        System.out.println();
    }

    //判断list是否满了
    public boolean isfull(){
        if (this.userSize==val.length){
            return true;
        }
        return false;

    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos<0||pos>userSize){
            System.out.println("位置不合法！");
            return;
        }
        if(isfull()){
            this.val=Arrays.copyOf(this.val,this.val.length*2);
        }
        for (int i=this.userSize-1; i>=pos; i--){
            this.val[i+1]=this.val[i];
        }
        this.val[pos]=data;
        this.userSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i=0;i<this.userSize;i++){
            if (this.val[i]==toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i=0;i<this.userSize;i++){
            if (this.val[i]==toFind){
                return i;
            }
        }
        return -1;//这里的-1是返回没有相应的元素
    }
    public boolean isEmpty(){
        if (this.userSize==0){
            return true;
        }
        return  false;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos<0||pos>this.userSize){
            System.out.println("该位置不合法！");
            return -1;//这里是业务上异常的处理，这里没有其它意思
        }
        if (isEmpty()){
            System.out.println("顺序表为空！");
            return -1;//这里是业务上异常的处理，这里没有其它意思
        }
        return this.val[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos<0||pos>this.userSize){
            System.out.println("该位置不合法！");
            return;
        }
        this.val[pos]=value;

    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (isEmpty()) {
            System.out.println("顺序表为空！");
            return;
        }
        int pos=search(toRemove);
        if (pos==-1){
            System.out.println("没有你要删除的位置！");
            return;
        }
        for (int i=pos;i<this.userSize-1;i++){
            this.val[i]=this.val[i+1];
        }
        this.userSize--;

    }
    // 获取顺序表长度
    public int size() {
        return this.userSize;
    }
    // 清空顺序表
    public void clear() {
        this.userSize=0;
    }
}
