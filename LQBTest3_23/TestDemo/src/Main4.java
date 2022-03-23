import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String m=scanner.next();
		String[] m_int=m.split("\\,");
		StringBuilder str=new StringBuilder();
		for(String i:m_int) {
			str.append(i);
		}
		System.out.println(str);
		
		
	}
}
