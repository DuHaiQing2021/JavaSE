import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();//每次最多挑多少水
		int t=scanner.nextInt();//总共需要挑多少水
		int t1=0; //此时挑的水
		int count=0;//挑水的次数
		while(t1<t) {
			t1+=a;
			count++;
		}
		System.out.println(count);
	}
}
