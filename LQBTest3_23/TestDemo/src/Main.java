
public class Main {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=2021;i++) {
			int temp=i;
			while(temp!=0) {
				int a =temp%10;
				if(a==2) {
					count++;
					System.out.println(i);
					break;
				}
				temp/=10;
			}
			
		}
		System.out.println(count);
	}

}
