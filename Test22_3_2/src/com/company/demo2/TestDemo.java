package com.company.demo2;

class Animal{
    public String name;
    public int age;

}

class Dog extends Animal{

    public  void eat(){
        System.out.println(this.age+"eat()");
    }

}
class Bird extends Animal{

    public String wing;
    public void fly(){
        System.out.println(this.name+"fly()");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="小白";
        System.out.println(dog.name);

        Bird bird=new Bird();
        bird.age=23;
        System.out.println(bird.age);

    }
}
