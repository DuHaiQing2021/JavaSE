package com.company;

import java.util.Scanner;

//自定义异常
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}

public class TestDemo {
    private final String name;
    private final String password;

    public TestDemo(String name,String password){
        this.name=name;
        this.password=password;
    }

    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return this.password;
    }

    //登录系统
    public void register(String name, String password) {
        try {
            if (!this.getName().equals(name) || !this.getPassword().equals(password)){
                throw new MyException("用户或密码输入有误！");
            }else{
                System.out.println("登录成功！");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
    //用户登录
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TestDemo testDemo=new TestDemo("张三","123456");
        System.out.println("请输入用户：");
        String name=scanner.next();
        System.out.println("请输入密码：");
        String password=scanner.next();
        testDemo.register(name,password);
    }
//    public void getCustomerInfo() {
//        try {
//            // do something that may cause an Exception
//        } catch (java.io.FileNotFoundException ex) {
//            System.out.print("FileNotFoundException!");
//        } catch (java.io.IOException ex) {
//            System.out.print("IOException!");
//        } catch (java.lang.Exception ex) {
//            System.out.print("Exception!");
//        }
//
//    }
//
//    private static void testMethod() {
//        System.out.println("testMethod");
//    }
//    public static void main(String[] args) {
//        ((TestDemo)null).testMethod();
//    }
//
//    public static void main1(String[] args) {
//
//    }
}
