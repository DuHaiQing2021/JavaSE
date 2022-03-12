package demo1;

public class Main3 {
	
	public static void main(String[] args) {
		char[] num= {'9','8','7','6','5','4','3','2','1','0'};
		int i,j,n;
		int count=0;
		for(i=0;i<10;i++) {
			for(j=i+1;j<10;j++) {
				for(n=j+1;n<10;n++) {
					count++;
					System.out.println(num[i]+" "+num[j]+" "+num[n]);
				}
			}
		}
		System.out.println("==================");
		System.out.println(count);
	}
	
}
