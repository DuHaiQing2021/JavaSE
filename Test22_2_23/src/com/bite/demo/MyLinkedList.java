package com.bite.demo;

/**
 * 代表一个节点
 */
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val=val;
    }
}
/**
 * 无头单向非循环链表
 */
public class MyLinkedList {
    public ListNode head;

    //创建一条链表
    public void createList(){
        ListNode listNode1=new ListNode(5);
        ListNode listNode2=new ListNode(66);
        ListNode listNode3=new ListNode(23);
        ListNode listNode4=new ListNode(30);
        ListNode listNode5=new ListNode(18);

        //把创建的表进行链接
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        this.head=listNode1;
    }
    //展示链表
    public void display1(){

    }
    //头插法
    public void addFirst(int data){
        ListNode listNode=new ListNode(data);
        listNode.next=this.head;
        this.head=listNode;

    }
    //尾插法
    public void addLast(int data){
        ListNode listNode=new ListNode(data);
        if (this.head==null){
            this.head=listNode;
            return;
        }
        ListNode cur=this.head;
        while(cur.next!=null) cur=cur.next;
        cur.next=listNode;

    };

    /**
     *
     * @param index
     * @return
     */
    public ListNode findIndex(int index){
        ListNode cur=this.head;
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if (index<0||index>this.size()){
            System.out.println("该位置不合法！");
            return false;
        }
        if (index==0){
            this.addFirst(data);
            System.out.println("插入成功！");
            return true;
        }
        if (index==this.size()){
            this.addLast(data);
            System.out.println("插入成功！");
            return true;
        }
        ListNode listNode=new ListNode(data);
        ListNode cur=this.findIndex(index);
        listNode.next=cur.next;
        cur.next=listNode;
        System.out.println("插入成功！");
        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=this.head;
        while(cur != null){
            if (cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    };
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head==null){
            System.out.println("该链表为空链表！");
            return;
        }
        if (this.head.val==key){
            this.head=this.head.next;
            return;
        }
        ListNode cur=this.head;
        while (cur.next!=null){
            if (cur.next.val==key){
                cur.next=cur.next.next;
                return;
            }
            cur=cur.next;
        }
        System.out.println("链表中没有该关键字！");
    };
    //删除所有值为key的节点
    public ListNode removeAllKey(int key){
        ListNode cur=this.head.next;
        ListNode prev=this.head;
        while(cur!=null){
            if (cur.val==key){
                prev.next=cur.next;
            }else {
                prev=cur;
            }
            cur=cur.next;
        }
        if(this.head.val==key){
            this.head=this.head.next;
        }
        return this.head;
    };
    //得到单链表的长度
    public int size(){
        int count=0;
        ListNode cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    };
    //展示链表
    public void display(){
        if (this.head==null){
            System.out.println("该链表为空链表！");
            return;
        }
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    };
    public void clear(){
        this.head=null;
    };




}
