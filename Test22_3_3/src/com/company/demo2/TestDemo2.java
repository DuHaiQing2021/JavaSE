package com.company.demo2;
import com.company.demo1.Animal;

class A{
    Animal animal=new Animal("哈哈哈哈",12);
    public void printf(){
        //此时会进行报错Animal中的eat方法的访问权限是protected，不能在不同包非子类类中进行访问
        //System.out.println(animal.eat());
    }
}

public class TestDemo2 {
    public static void main(String[] args) {


    }


}
