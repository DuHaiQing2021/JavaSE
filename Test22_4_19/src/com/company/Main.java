package com.company;

import java.util.Scanner;

public class Main {

    /**
     * 练习题 1
     * 输入一个字符串输出它的字符集合，
     * 例如1              例如2
     * 输入：abdfdsaf      输入：dfhjafjha
     * 打印：abdfds             dfhjdhfhi
     *                    打印：dfhja
     *                         dfhji
     *
     */
    //方法1
    public static String func1(String str) {
        StringBuilder a=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char n=str.charAt(i);
            if (!a.toString().contains(n+"")){
                a.append(n);
            }
        }
        return a.toString();
    }


    public static void main1(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            String str1=func1(str);
            System.out.println(str1);
        }
    }

    //方法2
    public static String func2(String str) {
        StringBuilder a=new StringBuilder();
        int[] array=new int[127];
        for (int i=0;i<str.length();i++){
            int flg=str.charAt(i);
            if (array[flg]==0){
                array[flg]=1;
                a.append(Character.toChars(flg));
            }
        }
        return a.toString();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str=scanner.nextLine();
            String a=func2(str);
            System.out.println(a);
        }
    }
}
