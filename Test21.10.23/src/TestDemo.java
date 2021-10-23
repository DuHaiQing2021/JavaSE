import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    /**
     * 打印 X 图形
     *
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int j = 0;
            for (int i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (i == j || j == n - 1 - i) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    /**
     * 完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
     */
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(100);
        while (true) {
            int n = scanner.nextInt();
            if (n < rand) System.out.println("猜小了！");
            else if (n > rand) System.out.println("猜大了！");
            else {
                System.out.println("恭喜，猜中了！");
                break;
            }
        }
    }

    /**
     * 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
     * 其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
     */
    public static void main3(String[] args) {
        for (int i = 0; i <= 999; i++) {
            int temp = i;
            int sum = 0;
            int count = 0;
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            temp = i;
            while (temp != 0) {
                sum += Math.pow(temp % 10, count);
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
    /**
     * 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
     */
    public static void main4(String[] args) {
        double sum = 1;
        double n = 1.0;
        for (int i = 2;i <= 100;i++){
            n = -n;
            sum += n/i;
        }
        System.out.printf("%.3f",sum);
    }
    /**
     * 求两个正整数的最大公约数
     */
    public static int max1(int a, int b) {
        int max=0;
        while(a%b!=0){
            max=a%b;
            a=b;
            b=max;
        }
        return max;
    }
    public static void main5(String[] args) {
        int max=max1(17,34);
        System.out.println("两个数的最大公约数为"+max);
    }

    /**
     *求一个整数，在内存当中存储时，二进制1的个数。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count=0;
        while(a!=0){
            if((a&1)==1) count++;
            a>>>=1;
        }
        System.out.println("改整数在内存中二进制存储1的个数是："+count);
    }
}


