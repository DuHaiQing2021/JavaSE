
public class Main2 {
	
	public static void main(String[] args) {
		int count=0;
		int n=2021;
		while(n!=1) {
			if(n%2!=0) {
				n+=1;
				count++;
			}else {
				n/=2;
				count++;
			}
		}
		System.out.println(count);
	}
}
