
public class TestDemo {
	static final int N=2021;
	public static void main(String[] args) {
		int[] num=new int[10];
		
		for(int i=0;i<10;i++) {
			num[i]=N;
		}
		int count=1;
		boolean flag=true;
		while(true&&flag) {
			int temp=count;
			while(temp!=0) {
				int t=temp%10;
				if(num[t]!=0) {
					num[t]--;
				}else {
					flag=false;
					count--;
					break;
				}
				temp/=10;
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
