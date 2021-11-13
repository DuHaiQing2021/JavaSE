package com.bit.demo;

import sun.awt.geom.AreaOp;

class Animal{
    public String name;
    public int age;
    public void eat() {
        System.out.println("吃东西");
    }
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Cat extends Animal{

    public Cat(String name, int age){
        super(name, age);
    }
    public void run(){
        System.out.println("跑起来");
    }
}
class Bird extends Animal{
    public String wing;
    public void fly(){
        System.out.println(super.name+"飞起来");
    }
    public Bird(String name,int age,String wing){
        super(name,age);
        this.wing="ff";
    }
}

public class Demo1 {
    public static void main(String[] args) {

//        Bird bird=new Bird();
//        bird.name="小黑";
//        System.out.println(bird.name);
//        bird.fly();
//        bird.eat();
//
//
//        Cat cat=new Cat();
//        cat.name="小白";
//        System.out.println(cat.name);
//        cat.run();


    }
}
