import java.util.Scanner;

public class Main3 {
	public static String fAn(int n) {
		StringBuilder an=new StringBuilder();
		int flag=0;
		int count=n;
		for(int i=1;i<=n;i++) {
			an.append("sin(");
			an.append(i);
			if(i==n) {
				an.append(")");
				break;
			}
			if(flag==0) {
				an.append("-");
				flag=1;
			}else {
				an.append("+");
				flag=0;
				}
			
		}
		while(count!=1) {
			count--;
			an.append(")");
		}
		return an.toString();
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		StringBuilder sn=new StringBuilder();
		int temp_num=n;
		int temp=n;
		while(temp>1) {
			temp--;
			sn.append("(");
		}
		for(int i=1;i<=n;i++) {
			sn.append(fAn(i));
			sn.append("+");
			sn.append(temp--);
			if(i!=n) {
				sn.append(")");
			}
		}
		
		System.out.println(sn.toString());		
		}
}
