package com.company;

import java.io.FileOutputStream;

public class FileOutputStreamTest4 {
    public static void main(String[] args) {
        try(
                FileOutputStream output=new FileOutputStream("Test.txt");
                ){
            String str="Hello World";
            byte[] date=str.getBytes();
            //此方法用来写入部分数据。会覆盖之前的全部内容。
            output.write(date,0,8);//write方法可以有三个参数（参数1：表示一个字节数组。参数2：表示数组的起始位置。参数3：表示要写入的长度）
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
