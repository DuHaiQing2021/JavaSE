import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("***********��1************");
        String[] goods={"Ʒ�ƣ�brand����������F928","Ʒ�ƣ�brand����������F928","������ͣ�type��������﮵��","�۸�price����499"};
        for(int i=0;i<goods.length;i++) {
            String goods1=goods[i];
            System.out.println(goods1);
        }
        System.out.println();



        System.out.println("***********��2************");
        int num = 5;
        num = num++ + ++num + --num + num--;
        System.out.println(num);
        System.out.println();



        System.out.println("***********��3************");
        System.out.println("������������:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("�����������ֵΪ:"+(num1<=num2?num2:num1));
        System.out.println("������������:");
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        int num5=sc.nextInt();
        int max=num3<num4?num4:num3;
        System.out.println("�����������ֵΪ:"+(max>=num5?max:num5));
        System.out.println();



        System.out.println("***********��4************");
        System.out.println("�������Ƿ��ǻ�Ա��(0-��,1-��)");
        int uservip=sc.nextInt();
        System.out.println("�����������ѵĽ�");
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
        System.out.println("ʵ��֧��"+total+"Ԫ");
    }

}
