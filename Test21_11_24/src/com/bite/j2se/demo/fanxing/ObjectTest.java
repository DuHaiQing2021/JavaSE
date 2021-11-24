package com.bite.j2se.demo.fanxing;

public class ObjectTest<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public ObjectTest(T obj) {
        super();
        this.obj = obj;
    }

    public ObjectTest() {
        super();
    }

    public static void main(String[] args) {
//        ObjectTest ot=new ObjectTest(new Integer(10));
//        Integer i1=(Integer) (ot.getObj());
//        //ClassCastExcep
//        String s1=(String) (ot.getObj());
//        System.out.println(i1);
        ObjectTest<Integer> ot =new ObjectTest<Integer>(99);
        Integer i1=ot.getObj();
        System.out.println(i1);
    }
}
