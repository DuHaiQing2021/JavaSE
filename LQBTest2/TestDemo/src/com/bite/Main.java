package com.bite;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		if((n>=1&&n<=26)&&m>=1&&m<=26) {
			char[][] array=new char[n][m];
			for(int i=0;i<m;i++) {
				array[0][i]=(char)('A'+i);
			}
			for(int i=1;i<n;i++) {
				array[i][0]=(char)('A'+i);
				for(int j=1;j<m;j++) {
					array[i][j] = array[i-1][j-1];
				}
			}
			for(int i=0;i<n;i++) {
				array[i].toString();
				System.out.println(array[i]);
			}
		}
			
		
	}
}
