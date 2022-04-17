package com.company;

import javax.naming.NameAlreadyBoundException;
import javax.naming.NamingException;
import java.text.ParseException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

//受查异常
class NameException extends RuntimeException{
    public NameException(String message){
        super(message);
    }

}
class PasswordException extends RuntimeException{
    public PasswordException(String message){
        super(message);
    }
}
///非受查异常,因为继承于
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class Main1 {

    private static final String name = "bit";
    private static final String password = "3131";

    public static void login(String name, String password) throws NameException, PasswordException {
        if (!Main1.name.equals(name)) {
            throw new NameException("用户名错误！");
        }
        if (!Main1.password.equals(password)) {
            throw new PasswordException("密码错误！");

        }
    }

    public static void fun1(int x) {
        try {
            if (x == 0) {
                throw new MyException("dsf");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.next();
            String passwrod = scanner.next();

            login(name, passwrod);
        } catch (NameException e) {
            e.printStackTrace();
            System.out.println("用户名错误！");
        } catch (PasswordException e) {
            e.printStackTrace();
            System.out.println("密码错误！");
        }
    }
}
