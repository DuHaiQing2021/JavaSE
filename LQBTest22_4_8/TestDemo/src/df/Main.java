package df;

public class Main {
	public static void main(String[] args) {
		int[] day= {6,7,1,2,3,4,5};
		int n=2022;
		int t=0;
		while(n!=0) {
			t=n%7;
			n/=7;
		}
		System.out.println(t);
	}
}
