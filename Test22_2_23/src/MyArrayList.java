import java.util.Arrays;
import java.util.Random;

public class MyArrayList {
    public int[] val;
    public int userSize;

    public MyArrayList(){
        this.val=new int[10];
    }

    // 打印顺序表
    public void display() {
        for (int i=0;i<this.userSize;i++){
            System.out.print(this.val[i]+" ");
        }
        System.out.println();
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos<0||pos>this.userSize){
            System.out.println("该位置不存在！");
            return ;
        }
        if (this.userSize==this.val.length){
            this.val= Arrays.copyOf(this.val,2*this.val.length);
        }
        for (int i=this.userSize-1;i>=pos;i--){
            this.val[i+1]=this.val[i];
        }
        this.val[pos]=data;
        this.userSize++;

    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i=0;i<this.userSize;i++){
            if (this.val[i]==toFind){
                return true;
            }
        }
        return false;

    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i=0;i<this.userSize;i++){
            if (this.val[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos<0||pos>=this.userSize){
            System.out.println("该位置不存在！");
            return -1;
        }
        if (isEmpty()){
            System.out.println("该顺序表为空！");
            return -1;
        }
        return this.val[pos];
    }
    //判断顺序表是否为空
    public boolean isEmpty(){
        return this.userSize == 0;
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos<0||pos>=this.userSize){
            System.out.println("该位置不存在！");
            return;
        }
       if (isEmpty()){
           System.out.println("该顺序表为空！");
           return;
       }
        this.val[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        if (isEmpty()){
            System.out.println("该顺序表为空！");
            return;
        }
        int index=this.search(toRemove);
        if (index==-1){
            System.out.println("该关键字不存在！");
            return;
        }
        for(int i=index;i<this.userSize-1;i++){
            this.val[i]=this.val[i+1];
        }
        this.userSize--;

    }
    // 获取顺序表长度
    public int size() {
        return this.userSize;
    }
    // 清空顺序表
    public void clear() {
        this.userSize=0;
    }
}