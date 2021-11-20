package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str="dff;dfhdf&dfd";
        String[] arr=str.split("&" );
        for (String a:arr){
            System.out.println(a);
        }
    }
}