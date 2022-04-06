import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] fib=new int[n];
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		for(int j:fib) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
