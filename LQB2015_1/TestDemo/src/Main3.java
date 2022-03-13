import java.util.Scanner;

/**
 * 标题： k倍区间

给定一个长度为N的数列，A1, A2, ... AN，如果其中一段连续的子序列Ai, Ai+1, ... Aj(i <= j)之和是K的倍数，我们就称这个区间[i, j]是K倍区间。  

你能求出数列中总共有多少个K倍区间吗？  

输入
-----
第一行包含两个整数N和K。(1 <= N, K <= 100000)  
以下N行每行包含一个整数Ai。(1 <= Ai <= 100000)  

输出
-----
输出一个整数，代表K倍区间的数目。  


例如，
输入：
5 2
1  
2  
3  
4  
5  
 * @author DHQ
 *
 */
public class Main3 {
	public static boolean check(double[] a) {  //检测Ai是否大于等于1，小于等于100000.
		boolean flg=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]<1||a[i]>100000) {
				flg=false;
				return flg;
			}
		}
		return flg;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		double[] a=new double[n];
		if(n>=1&&k<=100000) {
			for(int i=0;i<a.length;i++) {
				a[i]=scanner.nextDouble();
			}
		}
		check(a);
		double sum=0;
		int count=0;
		for(int x=0;x<a.length;x++) {
			sum=a[x];
			for(int y=x+1;y<a.length;y++) {
				sum+=a[y];
				if(sum%k==0) {
					count++;
				}
			}
			if(a[x]%k==0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
