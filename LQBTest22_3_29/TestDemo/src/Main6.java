import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] score=new int[n];
		int max=0;
		int min=100;
		double avg=0;
		for(int i=0;i<n;i++) {
			score[i]=scanner.nextInt();
			avg+=(score[i]*1.0)/n;
			if(max<score[i]) max=score[i];
			if(min>score[i]) min=score[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.printf("%.2f",avg);
	}
}
