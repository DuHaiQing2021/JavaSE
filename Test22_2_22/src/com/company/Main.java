package com.company;

import java.sql.SQLOutput;

class Calculator{
    private double num1;
    private double num2;

    public Calculator(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void setNum1(double num1){
        this.num1=num1;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double add(){
        return num1+num2;
    }
    public double sub(){
        return num1-num2;
    }
    public double mul(){
        return num1*num2;
    }
    public double dev(){
        return num1*1.0/num2;
    }
}
class MyValue{
    private double val;
    public void setVal(double val){
        this.val=val;
    }
    public double getVal(){
        return val;
    }
    public MyValue(double val){
        this.val=val;
    }
}
public class Main {

    public static void swap(MyValue myValue1,MyValue myValue2){
        double val=myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(val);

    }
    public static void main(String[] args) {
        MyValue myValue1=new MyValue(12);
        MyValue myValue2=new MyValue(35);
        swap(myValue1,myValue2);
        System.out.println(myValue1.getVal()+"\t"+myValue2.getVal());

    }
    public static void main1(String[] args) {
	// write your code here
      Calculator calculator=new Calculator(1,2);
      double add=calculator.add();
      double sub=calculator.sub();
      double mul=calculator.mul();
      double dev=calculator.dev();
      System.out.println("加:"+add+"\t"+"减:"+sub+"\t"+"乘:"+mul+"\t"+"除:"+dev);
    }

}
