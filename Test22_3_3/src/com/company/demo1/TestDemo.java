package com.company.demo1;

class Dog extends Animal{

    public Dog(String name,int age){
        super(name,age);
    }
    //对父类eat方法进行重写
    @Override
    protected void eat(){
        System.out.println(name+"在吃东西！");
    }
}

class Bird extends Animal{

    public Bird(String name,int age){
        super(name,age);
    }

    public void fly(){
        System.out.println(name+"在飞翔！");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //父类引用指向子类实例，子类实例赋值给父类引用。构成向上转型。
        Animal animal1=new Dog("小狗",5);
        Animal animal2=new Bird("小鸟",6);

        //子类方法覆盖/覆写/重写父类方法
        animal1.eat();
        animal2.eat();

        //此时会报错父类不能调用子类的方法，只能调用自身的方法。
        //animal2.fly();

        /**
         * 什么是多态？多态的构成方法？
         * 多态是一个引用多种状态，多态构成动态绑定、向上转型、向下转型
         * 动态绑定/运行时绑定：通过父类引用 调用父类和子类同名的  覆盖（也叫重写/覆写）  方法
         * 编译时绑定：子类通过调用父类的多个同名的 重载 方法。
         *
         * 覆写/覆盖/重写的条件：
         * 1.方法名相同。
         * 2.方法的参数列表的类型和个数相同。
         * 3.返回值相同（注意特殊情况下，返回值也可以不同是构成协变）
         *
         * static修饰的方法不能被重写，它和类的对象没有关系，自然不能被对象调用或者重写。
         * private 权限访问修饰的方法也不能被重写，应为它的访问权限只能是当前类中使用。
         * final 修饰的方法不能被重写，因为final修饰的方法和属性是不可以修改的。
         *子类方法的访问权限要大于等于父类访问权限。
         */


    }
}
