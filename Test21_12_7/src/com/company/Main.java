package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Main {
    public static void main1(String[] args) throws FileNotFoundException {
        try(
                FileInputStream input=new FileInputStream("Test.txt");
        ){
            int data1=input.read();//进行读取文本文件中的第一个数据并把数据转换成字节数据，传输进data中。完成后指针（光标）向后移动一位
            char ch1=(char) data1;
            System.out.println(ch1);
            int data2=input.read();//把之前调用read方法后光标移动到的地方获取数据，传输完成后，再往后移动一位。
            char ch2=(char) data2;
            System.out.println(ch2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main2(String[] args) {
        try(FileInputStream input=new FileInputStream("Test.txt")){
            byte[] data=new byte[3];
            input.read(data);//72 101 108读入data字节数组中
            System.out.println(Arrays.toString(data));
            String str=new String(data);//将data里的数据变成一个字符串
            System.out.println(str);//打印Hel
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main3(String[] args) {
        try(FileInputStream input =new FileInputStream("Test.txt")){
            int data=0;
            StringBuilder str=new StringBuilder();
            while ((data= input.read())!=-1){
                str.append((char)data);
            }
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try(
                FileInputStream input =new FileInputStream("Test.txt");
                FileOutputStream output=new FileOutputStream("Test_bak.txt");
        ){
            byte[] data=new byte[1024];
            int length=0;
            while ((length= input.read(data))!=-1){
                output.write(data,0,length);
            }
            output.flush();
            System.out.println("拷贝成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("拷贝失败");
        }

    }
}
