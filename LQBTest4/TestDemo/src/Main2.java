import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		String[] strArray= {
				"zero","one","two","three","four","five",
				"six", "seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen", 
				"sixteen","seventeen","eighteen","nineteen","twenty",
				"thirty","forty","fifty"
		};
		Scanner scanner=new Scanner(System.in);
		int h=scanner.nextInt();
		int m=scanner.nextInt();
		int temp_h=h;
		int temp_m=m;
		if(h>20) {
			temp_h=h%10;
			System.out.print(strArray[20]+" "+strArray[temp_h]+" ");
		}else {
			System.out.print(strArray[h]+" ");
		}
		
		if(m==0) {
			System.out.println("o'clock");
		}else if(m==20) {
			System.out.println(strArray[m]);
		}else if(m>20&&m<30){
			temp_m=m%10;
			System.out.print(strArray[20]+" "+strArray[temp_m]);
		}else if(m==30) {
			System.out.println(strArray[21]);
		}else if(m>30&&m<40) {
			temp_m=m%10;
			System.out.println(strArray[21]+" "+strArray[temp_m]);
		}else if(m==40) {
			System.out.println(strArray[22]);
		}else if(m>40&&m<50) {
			temp_m=m%10;
			System.out.println(strArray[22]+" "+strArray[temp_m]);
		}else if(m==50) {
			System.out.println(strArray[23]);
		}else if(m>50){
			temp_m=m%10;
			System.out.println(strArray[23]+" "+strArray[temp_m]);
		}else {
			System.out.println(strArray[m]);
		}
		
	}
}
