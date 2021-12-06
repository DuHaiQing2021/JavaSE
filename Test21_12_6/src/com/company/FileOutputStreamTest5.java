package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest5 {

    /**
     * FileOut
     * @param args
     */
    public static void main5(String[] args) {
        try(
                FileOutputStream output=new FileOutputStream("Test.txt",true);
                ){
            String str="sss";
            byte[] date=str.getBytes();
            output.write(date);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try(
                FileOutputStream output=new FileOutputStream("Test.txt",true);
                ){
            String str="sss";
            byte[] date=str.getBytes();
            output.write('\n');
            output.write(date);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
