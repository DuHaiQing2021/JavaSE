package com.company;
//import com.company.demo1.Main;

import java.util.Arrays;

public class Main {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNum(int age) {
        this.age = age;
    }

    public int getNum() {
        return this.age;
    }

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main1(String[] args) {
        // wewrite your code here
        //创建com.company包底下的Main类的对象；
        Main main1 = new Main("张三", 23);
        System.out.println(main1.toString());

        //如果需要导入com.company.demo1底下的Main类的对象.因为如果直接在开头导入demo1里的Main会造成与company包里的Main类冲突，
//      所以如果需要导入demo1里Main类需要用以下方式：
        com.company.demo1.Main main2 = new com.company.demo1.Main("良好", 3232);
        System.out.println(main2.toString());


    }

    public static void main(String[] args) {


    }
}
class Test{
    int num;//如果没有限定词默认就是包使用权限，只能在本包中使用的成员变量。



}