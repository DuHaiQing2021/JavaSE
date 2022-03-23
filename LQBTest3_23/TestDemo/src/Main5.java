import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		String[] chArray=new String[25];
		Scanner scanner=new Scanner(System.in);
		int count=0;
		for(int i=0;i<25;i++) {
			chArray[i]=scanner.next();
		}
		for(String i:chArray) {
			char[] a=i.toCharArray();
			for(int i1=0;i1<a.length;i1++) {
				if(a[i1]=='A') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
