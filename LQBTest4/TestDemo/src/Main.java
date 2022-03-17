import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int MAX=100000000;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] p=new int[n];
		
		for(int i=0; i<n;i++) {
			p[i]=scanner.nextInt();
		}
		
		int p0=0,p1=0,sum_p=0,sum=0;
		while((n-1)!=0) {
			Arrays.sort(p);
			p0=p[0];
			p1=p[1];
			sum_p=(p0+p1);
			sum+=sum_p;
			p[0]=sum_p;
			p[1]=MAX;
			n--;
		}
		
		System.out.println(sum);
		
	}
}
