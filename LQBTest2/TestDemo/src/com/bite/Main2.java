package com.bite;

public class Main2 {
	public static void main(String[] args) {
		int num=32;
		int n=0;
		while(n!=num) {
			int[] array=new int[5];
			int temp=n;
			int i=4;
			while(temp!=0) {
				array[i]=(temp%2);
				temp/=2;
				i--;
			}
			n++;
			for(int j=0;j<5;j++) {
				System.out.print(array[j]);
			}
			System.out.println();
		}

		
	}
}
