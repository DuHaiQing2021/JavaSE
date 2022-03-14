package com.lqb;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
		   for(int i=1000;i<=9999;i++) {
			   String a=Integer.toString(i);
			   char[] b=a.toCharArray();
			   boolean flg=true;
			   int r=b.length-1;
			   int l=0;
			   while(l<r) {
				   if(b[l]!=b[r]) {
					   flg=false;
					   break;
				   }
				   l++;
				   r--;
			   }
			   if(flg) {
				   System.out.println(i);
			   }
		  
	  }
}
}
