import java.util.Scanner;

public class TestDemo {

    /**
     * 计算1-100中出现的数字9的个数
     * @param args
     */
    public static void main1(String[] args) {
        int count=0;
        int temp=0;
        for(int i=1; i <= 100; i++){
            temp=i;
            while(temp%10 != 0 || temp/10 != 0){
                if(temp%10 == 9){
                    count++;
                }
                temp/=10;
            }
        }
        System.out.println("1-100中出现的数字9的个数："+count);
    }

    /**
     * 输出 1000 - 2000 之间所有的闰年
     */
    public static void main2(String[] args) {
        for(int year = 1000; year<=2000; year++){
            if(year%4 == 0 && year%100 != 0 || year%400 == 0){
                System.out.println(year+"年");
            }
        }
        System.out.println("以上年份都是闰年");
    }

    /**
     * 打印 1 - 100 之间所有的素数
     */
    public static void main3(String[] args) {
        int n=0;
        for (int i=3; i<=100; i+=2){
            for (n = 2; n<=Math.sqrt(i);n++) {
                if(i%n == 0) break;
            }
            if ( n > Math.sqrt(i)){
                System.out.println(i+"该数是素数");
            }
        }

    }

    /**
     * 给定一个数字，判定一个数字是否是素数
     */
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int n=0;
        for (n = 2; n <= Math.sqrt(a);n++) {
            if (a%n == 0){
                System.out.println("该数不是素数！");
                break;
            }
        }
        if (n > Math.sqrt(a)){
            System.out.println("是素数！");
        }
    }

    /**
     * 根据输入的年龄, 来打印出当前年龄的人是少年(低于18),
     * 青年(19-28), 中年(29-55), 老年(56以上)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println(age + "是少年");
        } else if (age >= 19 && age <= 28) {
            System.out.println(age + "是青年");
        } else if (age >= 29 && age <= 55) {
            System.out.println(age + "是中年");
        } else {
            System.out.println(age + "是老年");
        }

    }
}
