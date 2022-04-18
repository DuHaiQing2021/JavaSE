package com.company;

import java.util.ArrayList;
import java.util.List;

class MyArrayList<E>{
    private Object[] elementDate;//数组
    private  int userdSize;//代表有效的数组个数

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};//给定一个空数组
    public MyArrayList(){
        this.elementDate=DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    public MyArrayList(int capacity){
        if (capacity>0){
            this.elementDate=new Object[capacity];
        }else if (capacity==0){
            this.elementDate=new Object[0];
        }else {
            throw new IllegalArgumentException("初始化的容量不能为负数！");
        }

    }

    /**
     *
     * @param e
     * @return
     */
    public  boolean add(E e){

    }
}
public class Main {
    /**
     * 关于当ArrayList顺序表没有指定容量时为什么add方法可以放数据？
     *结论：如果ArrayList调用，不带参数的构造方法，那么顺序表的大小是0，当第一次add的时候，整个顺序表才变成为10；
     * 当这10个放满了，才开始扩容，以1.5倍率进行扩容
     * 如果调用的是给定容量的构造方法，那么你的顺序表的大小，就是你给定的容量，放满了还是1.5倍率进行扩容。
     *
     * @param args
     */
    //截取元素subList
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("sdf");
        System.out.println(arrayList);
        List<String> a = arrayList.subList(1,3);//左闭右开的区间，不包含3.
        System.out.println(a);
    }
    //查询元素indexOf
    public static void main7(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        int a=arrayList.indexOf("b");
        System.out.println(a);

    }
    //确认元素是否存在
    public static void main6(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
        boolean flg=arrayList.contains("a");
        System.out.println(flg);
    }
    //清除顺序表
    public static void main5(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);
    }
    //修改元素set()
    public static void main4(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        arrayList.set(0,"12");//修改0下标的元素
        System.out.println(arrayList);

    }
    //获取元素get()
    public static void main3(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        String ret=arrayList.get(2);//获取2下标的值
        System.out.println(ret);


    }

    //移除顺序表里的元素
    public static void main2(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        System.out.println("=================remove下标=================");
        arrayList.remove(0);//移除顺序表0下标的元素
        System.out.println(arrayList);

        System.out.println("=================remove元素==================");
        Boolean flg=arrayList.remove("a");//如果有该元素就删除该元素，返回true，如果没有就返回false
        System.out.println(flg);
        System.out.println(arrayList);

    }

    //对顺序表进行添加元素
    public static void main1(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);

        //将顺序表arrayList里的全部元素添加到顺序表arrayList1里面
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("dd");
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);



    }
}
