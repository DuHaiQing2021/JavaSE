package demo1;

public class Main2 {
	
	public static void main(String[] args) {
		int count=0;
		
		for(int i=1;i<10000;i++) {
			int sum=0;
			int n=(int)Math.pow(i, 3);
			while(n!=0) {
				sum+=(n%10);
				n/=10;
			}
			if(sum==i) {
				count++;
			}
		}
		System.out.println(count);
	}

}
