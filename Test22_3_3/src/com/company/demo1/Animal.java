package com.company.demo1;

public class Animal {
    public String name;
    public int age;
    protected int count;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //protected访问权限不能被不同包中非子类类访问
    protected void eat() {
        System.out.println("什么动物在吃东西！");
    }



}
