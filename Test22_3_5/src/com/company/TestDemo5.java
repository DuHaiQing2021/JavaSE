package com.company;
interface Iflying{
    void fly();

}
interface IRunning{
    void run();
}


interface ISwimming{
    void swim();
}
abstract class Animal{
    protected String name;
    public abstract void eat();

    public Animal(String name) {
        this.name = name;
    }
}
class Dog extends Animal implements IRunning{

    public Dog(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(name+"在吃");

    }
    public void run(){
        System.out.println(name+"在跑");
    }
}

class Bird extends Animal implements Iflying{

    public void fly(){
        System.out.println(name+"在飞");
    }
    public void eat(){
        System.out.println(name+"在吃");
    }
    public Bird(String name) {
        super(name);
    }

}
class Duck extends Animal implements Iflying,IRunning,ISwimming{


    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃");
    }



    @Override
    public void fly() {
        System.out.println(name+"在飞");
    }

    @Override
    public void run() {

        System.out.println(name+"在跑");
    }

    @Override
    public void swim() {

        System.out.println(name+"在游泳");
    }
}
public class TestDemo5 {
    //方法2
    public static void main(String[] args) {
        Bird bird=new Bird("小鸟");
        Dog dog=new Dog("小狗");
        Duck duck=new Duck("鸭子");
        Animal animal[]={bird,dog,duck};
        IRunning iRunning[]=new IRunning[]{dog,duck};
        Iflying iflying[]=new Iflying[]{bird,duck};
        ISwimming iSwimming[]=new ISwimming[]{duck};

        for (IRunning i: iRunning){
            i.run();
        }

        for (Iflying i:iflying){
            i.fly();
        }

        for (Animal i:animal){
            i.eat();
        }
        for (ISwimming i:iSwimming){
            i.swim();
        }
    }

    //方法1
    public static void main1(String[] args) {
        IRunning iRunning=new Dog("小白");
        iRunning.run();

        Iflying iflying=new Bird("小鸟");
        iflying.fly();

    }


}
