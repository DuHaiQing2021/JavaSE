import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		int h=0;
		int m=0;
		int s=0;
	
		h=t/3600%24;
		m=t/60%60;
		s=t%60;
		System.out.println(h+":"+m+":"+s);
	}
}
