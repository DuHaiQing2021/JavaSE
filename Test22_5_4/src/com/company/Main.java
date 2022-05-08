package com.company;

/**
 *
 * @param <T>此时代表当前类是一个泛型类，T：当作是一个占位符
 *
 */
class MyArray2<T>{
//    public T[] objects=new T[10];//error  1不能实例化泛型类型的数组

    //此时会自动进行元素类型检查
    public T[] objects=(T[])new Object[10];

    public void set(int pos,T val){
        this.objects[pos]=val;
    }

    public T get(int pos){
        return objects[pos];
    }


}

class MyArray1{
    public Object[] objects=new Object[10];

    public void setObjects(int pos,Object val){
        this.objects[pos]=val;
    }
    public Object get(int pos){
        return this.objects[pos];
    }
}
public class Main {

    public static void main(String[] args) {

        MyArray1 myArray1=new MyArray1();
        //存放元素什么都可以存
        myArray1.setObjects(1,0);
        myArray1.setObjects(0,"dfgas");


//        String str=myArray.get(0);//这里会报错原因是get方法返回的是Object类型
        String str1=myArray1.get(0).toString();//所以这里必须进行强转，非常麻烦
        System.out.println("----------------------------------------------------------------");
        MyArray2<String> myArray2=new MyArray2<String>();
        myArray2.set(0,"fdas"); //true
//        myArray2.set(1,1);//error  1.编译的时候，自动进行类型的检查
        String str2=myArray2.get(0);// 2.不需要进行类型的强制转换。泛型自动帮我们进行类型的转换

        MyArray2<Integer> myArray2_1=new MyArray2<>();
//        MyArray2<int> myArray2_2=new MyArray2<int>(); //3.基本数据类型（简单类型）不能作为泛型的参数。


    }
}
