package com.lqb;

import java.util.Scanner;

public class Main4 {

	public static int fun(int[] array,int a) {
		for(int i=0;i<array.length;i++) {
			if(a==array[i]) {
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		int a=scanner.nextInt();
		int ret=fun(array,a);
		System.out.println(ret);
		
	}
}
