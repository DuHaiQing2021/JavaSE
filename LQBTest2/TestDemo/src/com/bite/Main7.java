package com.bite;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.next();
		String str2=scanner.next();
		
		int[] a = new int[105];
		int[] b = new int[105];
		int[] c = new int[105];
		
		int a1 = 0;
		int b1 = 0;
		for(int i = str1.length()-1; i >= 0; i--) {
			a[a1++] = str1.charAt(i) - '0';
		}
		for(int i = str2.length()-1; i >= 0; i--) {
			b[b1++] = str2.charAt(i) - '0';
		}
		int ret = 0;
		for(int i = 0; i < 105; i++) {
			int number = a[i] + b[i] + ret;
			c[i] = number % 10;
			ret = number / 10;
		}
		
		boolean flg = false;
		for(int i = 104; i >= 0; i--) {
			if(c[i] != 0) {
				flg = true;
			}
			if(flg) {
				System.out.print(c[i]);
			}
		}
	}
}
