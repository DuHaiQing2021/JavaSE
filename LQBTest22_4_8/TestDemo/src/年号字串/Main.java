package ÄêºÅ×Ö´®;

import java.util.Scanner;

public class Main {
	private static char[] array=
		{' ','A','B','C','D','E',
	     'F','G','H','I','J','K',
	     'L','M','N','O','P','Q',
	     'R','S','T','U','V','W',
	     'X','Y','Z'}; 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		StringBuilder str=new StringBuilder("");
		int temp=n;
		while(temp!=0) {
			int f=temp%26;
			str.append(array[f]);
			temp/=26;
		}
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
