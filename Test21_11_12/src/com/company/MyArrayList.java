package com.company;

import java.util.List;

/**
 * 顺序表
 */
class ListNone{
    public int[] val;
    public int userSize;

    public ListNone(){
        this.val=new int[10];
    }

}
public class MyArrayList {
    ListNone list=new ListNone();

        // 打印顺序表
        public void display() {
            for (int i=0;i<list.userSize;i++){
                System.out.print(list.val[i]+" ");
            }
        }

        // 在 pos 位置新增元素
        public void add(int pos, int data) {

        }
        // 判定是否包含某个元素
        public boolean contains(int toFind) {
            return true;
        }
        // 查找某个元素对应的位置
        public int search(int toFind) {
            return -1;
        }
        // 获取 pos 位置的元素
        public int getPos(int pos) {
            return -1;
        }
        // 给 pos 位置的元素设为 value
        public void setPos(int pos, int value) {

        }
        //删除第一次出现的关键字key
        public void remove(int toRemove) {

        }
        // 获取顺序表长度
        public int size() {
            return 0;
        }
        // 清空顺序表
        public void clear() {

        }

}



