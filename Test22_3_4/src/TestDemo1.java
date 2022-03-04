

class A{

    private int a;

}
class B extends A{
    public void func(){

        //私有父类属性a没有被B类继承，私有属性只能在本类中使用不能被继承其他类中使用
//        System.out.println(this.a);
    }

}
public class TestDemo1 {



}
