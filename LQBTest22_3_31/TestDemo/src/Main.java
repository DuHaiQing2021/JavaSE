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
				if(i==j) {//���i==j����˵��û���ҵ���Ӧ���ַ�
					flag++;//��¼�ַ����е����ַ��ĸ���
					if(n%2==0||flag>1) {//ż���ַ��������е������ַ��������ַ����е����ַ��ĸ������ܵ��ڶ�
						System.out.println("Impossible");
						return;
					}
					cnt+=n/2-i;//������ҵ��������ַ����еĵ����ַ��Ƶ��ַ����м�Ĵ����͡�
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
