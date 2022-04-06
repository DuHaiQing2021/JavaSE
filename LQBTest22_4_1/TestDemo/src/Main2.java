import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void change(String date) {
		char[] d=date.toCharArray();
		int len=date.length()-1;
		int i=0;
		for(;i<date.length()/2;i++) {
			if(d[i]==d[len]) {
				len--;
			}else {
				if(d[i]>d[len]) {
					d[len]+=d[i]-d[len];
				}else {
					d[len]-=d[len]-d[i];
				}
				len--;
			}
			
		}
		Arrays.toString(d);
		if(d.equals(date)) {
			
			d[i]+=1;
			d[len]+=1;
			
			System.out.println(d);
		}else {
			d.toString();
			System.out.println(d);
		}
		len-=2;
		i+=2;
	
		System.out.println(d);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String date=scanner.next();
		change(date);
		
		
		
	}
}
