import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int v1=scanner.nextInt(); //���ӵ��ٶ�
		int v2=scanner.nextInt(); //�ڹ���ٶ�
		int t=scanner.nextInt();  //�������ȵ�ʱ��
		int s=scanner.nextInt();  //������Ϣ��ʱ��
		int l=scanner.nextInt();  //��·��
		
		int rL1=0; //�����ܵ�·��
		int dL2=0; //�ڹ��ܵ�·��
		int count=0; //��¼ʱ��
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
