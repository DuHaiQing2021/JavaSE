import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		String[] numbers= {"ling","yi","er","san","si"
				       ,"wu","liu","qi","ba","jiu"};
		String[] location= {"","","shi","bai","qian","wan","shi wan","bai wan","qian wan","yi","shi yi"};
	
		//111225
		Scanner scanner=new Scanner(System.in);
		
		String s=scanner.next();
		int len=s.length();
		for(int i=0;i<len;i++) {
			int ret=s.charAt(i)-'0';

			if(ret == 1 && (len-i)==3||(len-i)==6||(len-i)==10) {
				System.out.print("shi"+" "+location[len-i-1]+" ");
			}else if(ret==0) {
				if(i+1 < len && s.charAt(i+1)!='0') {
						System.out.print("ling"+" ");
				}
			}else {
				System.out.print(numbers[ret]+" "+location[len-i]+" ");
			}
		}
		
	}
}
