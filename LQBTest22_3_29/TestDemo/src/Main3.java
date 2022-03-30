import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		StringBuilder strNew=new StringBuilder("A");
		char ch= 'A';
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String ret = "";
		for(int i=1;i<n;i++) {
			ch++;
			ret=strNew.toString();
			strNew.append((char)ch);
			strNew.append(ret);
	
		}
		System.out.println(strNew);
	}
}
