import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();//ÿ�����������ˮ
		int t=scanner.nextInt();//�ܹ���Ҫ������ˮ
		int t1=0; //��ʱ����ˮ
		int count=0;//��ˮ�Ĵ���
		while(t1<t) {
			t1+=a;
			count++;
		}
		System.out.println(count);
	}
}
