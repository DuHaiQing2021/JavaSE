import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.next();
		String str2=scanner.next();
		
		boolean flg=false;
		flg=(str1.length()==str2.length());
		
		if(str1.length()!=str2.length()) {
			System.out.println("1");
		}else if(flg&&str1.equals(str2)) {
			System.out.println("2");
		}else if(flg&&(str1.toLowerCase().equals(str2.toLowerCase()))) {
			System.out.println("3");
		}else  {
			System.out.println("4");
		}
		
		
	}
}
