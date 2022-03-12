package demo1;

import java.util.Arrays;

public class Main7 {

	public static void main(String[] args) {
		int[] num= {8,5,7,8,61,2,3,10,0};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		int index=Arrays.binarySearch(num, 3);
		System.out.println(index);
		
	}
}
