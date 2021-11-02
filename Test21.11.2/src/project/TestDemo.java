package project;

import java.util.Scanner;

public class TestDemo {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("***********题1************");
		String[] goods={"品牌（brand）：爱国者F928","品牌（brand）：爱国者F928","电池类型（type）：内置锂电池","价格（price）：499"};
		for(int i=0;i<goods.length;i++) {
			String goods1=goods[i];
			System.out.println(goods1);
		}
		System.out.println();
		
		
		
		System.out.println("***********题2************");
		int num = 5;  
		num = num++ + ++num + --num + num--;
		System.out.println(num);
		System.out.println();
		
		
		
		System.out.println("***********题3************");
		System.out.println("请输入两个数:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("两个数的最大值为:"+(num1<=num2?num2:num1));
		System.out.println("请输入三个数:");
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int num5=sc.nextInt();
		int max=num3<num4?num4:num3;
		System.out.println("三个数的最大值为:"+(max>=num5?max:num5));
		System.out.println();

		
		
		System.out.println("***********题4************");
		System.out.println("请输入是否是会员：(0-否,1-是)");
		int uservip=sc.nextInt();
		System.out.println("请输入你消费的金额：");
		double expense=sc.nextDouble();
		double total=expense;
		if(uservip==1) {
			if(expense>=200) {
				total=expense*0.75;
			}else {
				total=expense*0.8;
			}
		}else {
			if(expense>=100) {
				total=expense*0.9;
			}
		}
		System.out.println("实际支付"+total+"元");
	}

}