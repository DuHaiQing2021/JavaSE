package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void fun1(int x) throws ArithmeticException{
        System.out.println(10/x);//这里已经抛出异常了所以不会向下执行了
        if(x==0){
            throw new ArithmeticException("x==0");
        }
    }

    public static String fun2() throws FileNotFoundException {
        File file =new File("D:/text.txt");
        Scanner scanner =new Scanner(file);
        return scanner.nextLine();
    }

    public static void main4(String[] args) {
	// write your code here
       try{
           fun1(0);
       }catch (ArithmeticException e){
           e.printStackTrace();//异常默认打印”by zero“
       }
        System.out.println("异常处理了");
    }

    public static void main(String[] args)  {
        try {
            fun2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
