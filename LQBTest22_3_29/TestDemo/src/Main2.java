import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int[][] array=new int[n][n];
		int[] sum=new int[21];//¥Ê∑≈∫œ∏Ò–æ∆¨±‡∫≈
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=scanner.nextInt();
				if(array[i][j]==1) {
					sum[j]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(sum[i]>n/2) {
				System.out.print(i+1+" ");
			}
			
		}
		
		System.out.println();
		scanner.close();
	}
}
