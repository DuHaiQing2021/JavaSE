package com.lqb;

public class Main3 {

	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {
			int temp=i;
			int sum=0;
			int a=0;
			while(temp!=0) {
				a=temp%10;
				sum+=((int)Math.pow(a, 3));
				temp/=10;
				
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
