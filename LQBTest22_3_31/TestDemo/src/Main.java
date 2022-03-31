import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String str=scanner.next();
		
		int len=n-1;
		int flag=0;
		int cnt=0;
		char[] s=str.toCharArray();
		
		for(int i=0;i<len;i++) {
			for(int j=len;j>=0;j--) {
				if(i==j) {//如果i==j成立说明没有找到对应的字符
					flag++;//记录字符串中单独字符的个数
					if(n%2==0||flag>1) {//偶数字符串不能有单独的字符，奇数字符串中单独字符的个数不能等于二
						System.out.println("Impossible");
						return;
					}
					cnt+=n/2-i;//计算把找到的奇数字符串中的单独字符移到字符串中间的次数和。
					break;
				}else if(s[i]==s[j]) {
					cnt+=len-j;
					for(int k=j;k<len;k++) {
						s[k]=s[k+1];
					}
					len--;
					break;
				}
				
			}
			
		}
		System.out.println(cnt);
		
	}
}
