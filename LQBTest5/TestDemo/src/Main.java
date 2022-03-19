import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int v1=scanner.nextInt();
		int v2=scanner.nextInt();
		int t=scanner.nextInt();
		int s=scanner.nextInt();
		int l=scanner.nextInt();
		if((v1<=100&&v2<=100)&&t<=300&&s<=10&&l<=10000) {
			if(l%v1==0&&l%v2==0) {
				int tl=v2;  //ÎÚ¹êÅÜµÄ
				int rl=v1;  //ÍÃ×ÓÅÜµÄ
				boolean flag_t=false;
				boolean flag_r=false;
				int time_t=1;
				int time_r=1;
				while(true) {
					
					if(tl>=l) {
						flag_t=true;
					}
					if(rl>=l) {
						flag_r=true;
					}
					if(flag_t&&flag_r==false) {
						System.out.println("T");
						System.out.println(time_t);
						return;
					}
					if(flag_t==false&&flag_r) {
						System.out.println("R");
						System.out.println(time_t);
						return;
					}
					if(flag_t&&flag_r) {
						System.out.println("D");
						System.out.println(time_t);
						return;
					}
					if(Math.abs(rl-tl)>=t) {
						tl+=(v2*s);
						time_t+=s;
					}
					rl+=v1;
					tl+=v2;
					time_r++;
					time_t++;
				}
				
			}
			
		}
	}
}
