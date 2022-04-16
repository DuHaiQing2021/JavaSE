package 数列求值;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		int n=20190324;
		long a[]=new long[n];
		a[0]=a[1]=a[2]=1;
		int i=0;
		for(i=3;i<n;i++) {
			a[i]=a[i-1]+a[i-2]+a[i-3];
			if(a[i]>10000) a[i]%=10000;
		}
		System.out.println(a[i-1]);
	}
}
