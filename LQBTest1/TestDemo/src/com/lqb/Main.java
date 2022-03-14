package com.lqb;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if(n>=1&&n<=200) {
		    int[] array=new int[n];
		    for (int i = 0; i < array.length; i++) {
				array[i]=scanner.nextInt();
				if(Math.abs(array[i])<10000) {
					continue;
				}else return;
			}
		    Arrays.sort(array);
		    for(int i = 0; i < array.length; i++)System.out.print(array[i]+" ");
		}
		
	}
	
}
