public class TestDemo {
    /**
     * 编写程序数一下 1到 100 的所有整数中出现多少个数字9
     */
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 100; i++) {
            while(true) {
                if(i%10 == 9){
                    count++;
                } else if(i%10 == 0){
                    break;
                }
                i/=10;
            }
        }
        System.out.println("1到100中出现的数字9的个数："+count);
    }

}
