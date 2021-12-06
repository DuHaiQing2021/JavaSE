package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

    public static void main(String[] args) throws IOException {
        try(
                //创建一个基于磁盘的输入流，它连接流进java程序和本地磁盘（在Java程序和磁盘之间架设的一个管道）
                FileOutputStream output=new FileOutputStream("Test.txt")
        ){
            String str="Hello";
            byte[] data=str.getBytes();//将字符串变成字节数据。
            output.write(data);//写入字节，write只能写入字节数据。
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
