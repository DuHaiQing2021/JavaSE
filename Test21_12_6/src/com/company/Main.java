package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //创建文本Test1.txt,以从java中输出数据进文件。如果没有该文本文件则进行创建，如果有则进行写入或者不用写入。
        new FileOutputStream("Test1.txt");

        //创建文本Test2.txt,输入数据akuW字符进文本。
        try(FileOutputStream output=new FileOutputStream("Test2.txt")){
            //把数字对应的ASCII写入文本文件中，效率很低
            output.write(97);
            output.write(107);
            output.write(117);
            output.write(87);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
