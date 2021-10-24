package com.company;

import java.util.Scanner;

public class TestDemo {
    public static void main1(String[] args) {
        int n = 10;
        System.out.print("奇数位：");
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print((n>>i)&1);
        }
        System.out.println();
        System.out.print("偶数位：");
        for (int i = 31; i >= 0 ; i-=2) {
            System.out.print((n>>i)&1);
        }
    }

    /**
     * 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
     * 密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
     */
    public static void main2(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int i=0;
        for ( i = 2; i >= 0; i--) {
            String password=scanner.nextLine();
            if (password.equals("absc23")){
                System.out.println("密码正确，登录成功");
                break;
            }else {
                System.out.println("密码错误，请重新输入。还有剩下"+i+"机会。");
            }
        }
        if(i==-1){
            System.out.println("三次输入错误，退出程序");
        }
    }

    /**
     * 输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
     */
    public static void print(int a) {
        if (a<10){
            System.out.print(a+" ");
        }else{
            print(a/10);
            System.out.print(a%10+" ");
        }
    }
    public static void main3(String[] args) {
        print(123);
    }

    /**
     * 输出n*n的乘法口诀表，n由用户输入。
     */
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int j=1;
        for (int i = 1; i <= n; i++) {
            for ( j = 1; j <= n; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");
                if (i==j) {
                    System.out.println();
                    break;
                }
            }
        }
    }
    /**
     * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
     */
    public static void main5(String[] args) {
        int[] arr={1,2,2,7,1,6,6};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum^arr[i];
        }
        System.out.println(sum);
    }

    /**
     * 写一个myToString
     *
    public static String myToString(int[] array) {
        String ret="[";
        for (int i = 0; i < array.length; i++) {
            ret=ret+array[i];
            if (i!=array.length-1){
                ret=ret+",";
            }
        }
        ret=ret+"]";
        return ret;
    }
    public static void main6(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(myToString(array));
    }

    /**
     *求斐波那契数列的第n项。(迭代实现)
     */
    public static int fun(int n){
        int f1=1;
        int f2=1;
        int f3=0;
        for (int i = 3; i <= n; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int ret= fun(n);
        System.out.println("斐波那契第"+n+"项的值是："+ret);
    }

    /**
     * 求1！+2！+3！+4！+........+n!的和
     */
    public static int facSum(int n){
        int sum=0;
        int temp=1;
        for (int i = 1; i <= n; i++) {
            temp*=i;
            sum+=temp;
        }
        return sum;
    }
    public static void main8(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=facSum(n);
        System.out.println("n的阶乘和为："+sum);
    }

    /**
     * 求 N 的阶乘 。
     */
    public static int fac(int n){
        int fn=1;
        for (int i = 1; i <= n; i++) {
            fn*=i;
        }
        return fn;
    }
    public static void main9(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int ret=fac(N);
        System.out.println(N+"的阶乘为："+ret);
    }
    /**
     * 调整数组顺序使得奇数位于偶数之前。
     * 调整之后，不关心大小顺序。
     */
    public static void main10(String[] args) {
        int[] num={2,5,6,22,7,3} ;
        int left=0;
        int right=num.length-1;
        int temp=0;
        while(left<right){
            while (left < right && num[left]%2 != 0){
                left++;
            }
            while(left < right && num[right]%2 == 0){
                right--;
            }
            temp=num[left];
            num[left]=num[right];
            num[right]=temp;
        }
        for (int x:num) {
            System.out.println(x+" ");
        }

    }
    /**
     * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
     *要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     */
    public static int max2(int a,int b){
        return a>b ? a : b;
    }
    public static int max3(int a,int b, int c){
        return max2(max2(a,b),c);
    }
    public static void main11(String[] args) {
        int max=max3(12,6,1);
        System.out.println("最大值为："+max);
    }

    /**
     *在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
     * 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     */
    //求两个整数的最大值
    public static int max(int a,int b){
        return a>b?a:b;
    }
    //求两个小数的最大值
    public static double max(double a,double b){
        return a>b?a:b;
    }
    //求两个小数和一个整数的大小关系
    public static void max(double a,double b,int c){
        double d = (double)c;
        if(a < b){
            double temp = a;
            a = b;
            b = temp;
        }
        if(a<d){
            double temp = a;
            a = d;
            d = temp;
        }
        if(b < d){
            double temp = b;
            b = d;
            d = temp;
        }
        System.out.println(a+">"+b+">"+d);
    }
    public static void main12(String[] args) {
        int a = 10;
        int d = 30;
        double b = 5.0;
        double c = 15.0;
        max(c,b,a);
        int max_int = max(a,d);
        double max_f = max(b,c);
        System.out.println("两个整数的最大值是："+max_int);
        System.out.println("两个小数的最大值是："+max_f);
    }

    /**
     * 在同一个类中,分别定义求两个整数的方法和 三个小数之和的方法。
     */
    public static int Add(int a,int b){
        return a+b;
    }
    public static double Add(double a,double b,double c){
        return a+b+c;
    }
    public static void main13(String[] args) {
        int add_int = Add(5,6);
        double add_f = Add(5.5,9.1,12.23);
        System.out.println("两个整数的和："+add_int);
        System.out.println("三个小数的和："+add_f);
    }

    /**
     *实现一个方法 avg, 以数组为参数,
     * 求数组中所有元素的平均值(注意方法的返回值类型)
     */
    public static double avg(int[] arr) {
        int sum=0;
        double avg=0;
        for (int x: arr) {
            sum+=x;
        }
        avg=(sum*1.0)/arr.length;
        return avg;
    }
    public static void main14(String[] args) {
        int[] arr={1,2,5,12,0,1,15,20};
        double avgs=avg(arr);
        System.out.println("该数组的平均值是："+avgs);
    }

    /**
     * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和
     */
    public static int sum(int[] arr){
        int sum=0;
        for (int x:arr) {
            sum+=x;
        }
        return sum;
    }
    public static void main15(String[] args) {
        int[] arr={33,26,23,12,45,55};
        int arr_sum=sum(arr);
        System.out.println("数组所有元素之和是："+arr_sum);
    }

    /**
     *
     * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
     * 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
     */
    public static int[] transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=2;
        }
        return arr;
    }
    public static void main16(String[] args) {
        int[] arr={2,3,5,0,41};
        int[] trans_arr=transform(arr);
        for (int x:trans_arr) {
            System.out.print(x+" ");
        }
    }

    /**
     * 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
     */
    public static void printArray(int[] arr) {
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void main17(String[] args) {
        int[] arr={5,4,9,3,12,55,66};
        printArray(arr);
    }

    /**
     * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
     */
    public static int[] trans(int[] arr) {
        int j=1;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr=new int[100];
        int[] tran_arr = trans(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(tran_arr[i]+" ");
            if((i+1)%25==0) System.out.println();
        }
    }


}
