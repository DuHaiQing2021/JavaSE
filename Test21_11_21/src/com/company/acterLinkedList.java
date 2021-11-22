package com.company;

// 1、无头单向非循环链表实现
public class acterLinkedList implements ILinkedList{
    //链表的头节点
    public ListNode head;
    //创建默认节点用于调试
    public void creatNode(){
        ListNode node1=new ListNode(15);
        ListNode node2=new ListNode(65);
        ListNode node3=new ListNode(45);
        ListNode node4=new ListNode(13);
        ListNode node5=new ListNode(5);

        //链接节点
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        //头节点
        this.head=node1;
    }
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        node.next=this.head;
        this.head=node;

    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if (this.head==null){
            this.head=node;
            return;
        }
        ListNode cur=this.head;
        while (true){
            if (cur.next==null){
                cur.next=node;
                break;
            }
            cur=cur.next;
        }

    }
    //判断链表是否为空
    public boolean isEmpty(){
        if (this.head==null){
            return true;
        }
        return false;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if (index<0||index>size())
        {
            System.out.println("位置不合法法");
            return false;
        }
        ListNode cur=this.head;

        if (index==0){
            addFirst(data);
            return true;
        }
        if (index==size()){
            addLast(data);
            return true;
        }
        ListNode node=new ListNode(data);
        if (isEmpty()){
            this.head=node;
            return true;
        }
        for (int i=0;i<index-1;i++){
            cur=cur.next;
        }
        node.next=cur.next;
        cur.next=node;
        return true;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=this.head;
        while (cur!=null){
            if (cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){

        ListNode cur=this.head;
        if (cur.val==key){
            this.head=cur.next;
            return;
        }
        while (cur.next!=null){
            if (cur.next.val==key){
                cur.next=cur.next.next;
                return;
            }
            cur=cur.next;
        }
        if (cur.next==null){
            System.out.println("没有该关键字");
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur_copy=this.head;
        ListNode cur=this.head.next;
        while (cur!=null){
            if (cur.val==key){
                cur_copy.next=cur.next;
            }else {
                cur_copy=cur;
            }
            cur=cur.next;
        }
        if (head.val==key){
            head=head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        int count=0;
        ListNode cur=this.head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //展示列表
    public void display(){
        ListNode cur=this.head;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //清空链表
    public void clear() {
        while (this.head!=null){
            ListNode curNext=head.next;
            this.head.next=null;
            this.head=curNext;
        }

    }
}