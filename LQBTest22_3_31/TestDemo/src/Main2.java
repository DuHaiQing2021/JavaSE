import java.util.Scanner;

public class Main2 {
	static int[][] num=new int[201][201];
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				num[i][j]=scanner.nextInt();
			}
		}
		int count=0;//ͳ������ĸ���
		int i=0,j=0;
		while(count!=n*m) {
			//����
			while(i<m&&num[i][j]!=-1) {
				System.out.print(num[i][j]+" ");
				num[i][j]=-1;
				i++;
				count++;
			}
			i--; //i�����˷�Χ��
			j++; //��+1 ת��
			
			//����
			while(j<n&&num[i][j]!=-1) {
				System.out.print(num[i][j]+" ");
				num[i][j]=-1;
				j++;
				count++;
			}
			j--; //j�����˷�Χ��
			i--; //��-1 ת��
			
			//����
			while(i>=0&&num[i][j]!=-1) {
				System.out.print(num[i][j]+" ");
				num[i][j]=-1;
				i--;
				count++;
			}
			i++; //i�����˷�Χ��
			j--; //��-1 ת��
			
			//����
			while(j>=0&&num[i][j]!=-1) {
				System.out.print(num[i][j]+" ");
				num[i][j]=-1;
				j--;
				count++;
			}
			j++; //i�����˷�Χ��
			i++; //��+1 ת��
		}
		
	}
}
