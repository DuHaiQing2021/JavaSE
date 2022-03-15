package com.bite;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		long sum=0;
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
