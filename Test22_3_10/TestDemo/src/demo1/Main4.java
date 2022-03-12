package demo1;

public class Main4 {
	public static void main1(String[] args) {
		int n=0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			n+=i;
			sum+=n;
		}
		System.out.println(sum);
	}
	//生日蜡烛

//某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。

//现在算起来，他一共吹熄了236根蜡烛。

//请问，他从多少岁开始过生日party的？

//请填写他开始过生日party的年龄数。
//注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
	public static void main(String[] args) {
		int i=0;
		int age=0;
		int sum=236;
		boolean flg=true;
		while(flg) {
			sum=236;
			age++;
			i=age;
			while(sum>0) {
				i++;
				sum-=i;
			}
			if(sum==0) {
				flg=false;
			}else continue;
		}
		System.out.println(age);
		
		
	}
}
