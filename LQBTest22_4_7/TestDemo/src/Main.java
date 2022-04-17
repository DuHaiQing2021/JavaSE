
public class Main {
	public static void func(int count,int num) {
		
		if(num==1) {
			System.out.println(count);
			return;
		}
		count++;
		if(num%2==0) {
			func(count,num/2);
		}else {
			func(count,num-1);
			func(count,num+1);
		}
		count--;
		
	}
	public static void main(String[] args) {
		func(0,2021);
		
	}
}
