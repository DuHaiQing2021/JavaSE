import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int v1=scanner.nextInt(); //兔子的速度
		int v2=scanner.nextInt(); //乌龟的速度
		int t=scanner.nextInt();  //兔子领先的时间
		int s=scanner.nextInt();  //兔子休息的时间
		int l=scanner.nextInt();  //总路程
		
		int rL1=0; //兔子跑的路程
		int dL2=0; //乌龟跑的路程
		int count=0; //记录时间
		while(true) {
			rL1+=v1;
			dL2+=v2;
			count++;
			if(rL1==l||dL2==l) {
				break;
			}
			if(rL1-dL2>=t) {
				rL1-=s*v1;
			}
		}
		if(rL1>dL2) {
			System.out.println("R");
			System.out.println(count);
		}else if(rL1<dL2) {
			System.out.println("T");
			System.out.println(count);
		}else {
			System.out.println("D");	
			System.out.println(count);
		}
	}
}
