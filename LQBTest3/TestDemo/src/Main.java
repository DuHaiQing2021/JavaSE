import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [1000000];
		String s=String.valueOf(n);
		//将输入数字倒序输入数组中
		for(int i=s.length()-1;i>=0;i--) {
			a[s.length()-1-i]=s.charAt(i)-'0';
		}
		int m=s.length()-1;
		//将数组中的每一位元素都乘以i（i就是n，每次减去1进行阶乘运算）
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<=m;j++) {
				a[j]=a[j]*i;
			}
			int flag=0;
			//进位运算，保留除以10的余数，多余的进给下一位
			while(true) {
				a[flag+1]=a[flag+1]+a[flag]/10;
				a[flag]=a[flag]%10;
				if(flag==m&&a[m+1]!=0) {
					m++;
				}
				if(flag==m&&a[m+1]==0) {
					break;
				}
				flag++;
			}
		}
		//输出结果
		for(int i=m;i>=0;i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}

	

