import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[][] pascal=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0||i==j) {
					pascal[i][j]=1;
					System.out.print(pascal[i][j]+" ");
				}else {
					pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
					System.out.print(pascal[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
