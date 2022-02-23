/***
 * 测试顺序表
 */
public class TestDemo {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1,23);
        myArrayList.add(0,20);
        myArrayList.add(1,55);
        myArrayList.add(2,33);
        myArrayList.add(3,4);
//        myArrayList.display();
//        int i=myArrayList.size();
//        System.out.println(i);
//        int a=myArrayList.getPos(2);
//        System.out.println(a);
//        myArrayList.setPos(2,16);
//        myArrayList.display();
//        myArrayList.setPos(4,66);
        myArrayList.display();
    }

}
