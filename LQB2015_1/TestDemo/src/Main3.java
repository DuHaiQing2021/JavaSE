import java.util.Scanner;

/**
 * ���⣺ k������

����һ������ΪN�����У�A1, A2, ... AN���������һ��������������Ai, Ai+1, ... Aj(i <= j)֮����K�ı��������Ǿͳ��������[i, j]��K�����䡣  

��������������ܹ��ж��ٸ�K��������  

����
-----
��һ�а�����������N��K��(1 <= N, K <= 100000)  
����N��ÿ�а���һ������Ai��(1 <= Ai <= 100000)  

���
-----
���һ������������K���������Ŀ��  


���磬
���룺
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
	public static boolean check(double[] a) {  //���Ai�Ƿ���ڵ���1��С�ڵ���100000.
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
