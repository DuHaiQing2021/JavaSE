package com.lqb;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[] array=new int[n];
		
		int sum=0;
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
			sum+=array[i];
		}
		int max=array[0];
		int min=array[0];
		for(int i=1;i<n;i++) {
			if(array[i]>max) max=array[i];
			if(array[i]<min) min=array[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		
	}
}
