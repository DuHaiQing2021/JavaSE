package demo1;

public class Main4 {
	public static void main1(String[] args) {
		int n=0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			n+=i;
			sum+=n;
		}
		System.out.println(sum);
	}
	//��������

//ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������

//��������������һ����Ϩ��236������

//���ʣ����Ӷ����꿪ʼ������party�ģ�

//����д����ʼ������party����������
//ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
	public static void main(String[] args) {
		int i=0;
		int age=0;
		int sum=236;
		boolean flg=true;
		while(flg) {
			sum=236;
			age++;
			i=age;
			while(sum>0) {
				i++;
				sum-=i;
			}
			if(sum==0) {
				flg=false;
			}else continue;
		}
		System.out.println(age);
		
		
	}
}
