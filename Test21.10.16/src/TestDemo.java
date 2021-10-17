import java.util.Scanner;

public class TestDemo {
    //循环结构
    //
    //for语句
    public static void main9(String[] args) {
        int sum=0;
        for (int i=0;i<=10;i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    //习题：找出1-100既能被3整除，也能被5整除的数
    public static void main8(String[] args) {
        int i=1;
        while(i<=100) {
            if (i%3!=0 || i%5!=0) {
                i++;
            }else{
                System.out.println(i);
                i++;
            }

        }
    }
    //continue
    public static void main7(String[] args) {
        int i=1;
        while(i<=10)
        {
            if (i%3!=0)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    //break
    public static void main6(String[] args) {
        int i=1;
        while(i<=10)
        {
            if (i%3==0)
                break;
            i++;
        }
    }
    //do-while 用不到
    //while语句
    public static void main5(String[] args) {
        int i=0;
        int sum = 0;
        while(i<10){
            sum++;
            i++;
        }
        System.out.printf("sum=%d,i=%d",sum,i);
    }

    //选择结构
    public static void main4(String[] args) {
        /*
        switch语句
        switch里的参数不能用： float double long “不能用于复杂表达式”
        可用参数：char “枚举” string int
        */
        int a=1;
        switch (a){
            case 1:
                System.out.println("1");
                //break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("选择错误");
        }
    }
    //if——else语句
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if (year%100 == 0 && year%400 == 0){
            System.out.println(year+"年是世纪闰年");
        } else{
            if (year%4==0){
                System.out.println(year+"年是普通闰年");
            }
            else{
                System.out.println(year+"年不是闰年");
            }
        }
        scanner.close();
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        if(a % 2 == 0){
            System.out.println("偶数");
        } else{
            System.out.println("奇数");
        }

    }
    //顺序结构
    public static void main(String[] args) {
//        System.out.println("vvv");
//        System.out.println("vvv");
//        System.out.println("vvv");
//        System.out.println("vvv");
        short a=128;
        byte b=(byte)a;
        System.out.printf("%d %d\n",a,b);
        double x=2.0;
        int y=4;
        x/=++y;
        System.out.println(x);
        
    }
}
