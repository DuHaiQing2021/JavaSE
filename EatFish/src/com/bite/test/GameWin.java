package com.bite.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//窗口的创建
//1_1.使用java创建一个窗口
//1_2创建一个普通的java类，然后继承JFrame类成为一个窗口类。
public class GameWin extends JFrame {
    /*游戏状态分为 5种: 0未开始 1游戏中 2通关失败 3通关成功  4暂停*/

    //15.设置游戏默认状态
    static int state = 0;

//    //创建敌方鱼类
//    Enamy enamy1= new Enamy().new Enamy_1_L();
//    Enamy enamy2= new Enamy().new Enamy_2_L();
//    Enamy enamy3= new Enamy().new Enamy_3_L();

    //敌方鱼类集合
    Enamy enamy;

    //boss鱼类
    Enamy boss;
    boolean isboss=false;

    //创建随机变量
    Random random=new Random();


    //我方鱼类
    MyFish myFish = new MyFish();

    //6—1
    Image offScreenimg;
    //6-2 背景类对象的创建
    Bg bg=new Bg();

//    //创建一个工具类对象
//    GameUtils gameUtils=new GameUtils();

    //定义高和宽的变量
    protected int width=1440;
    protected int height=900;

    //设计一个标签
    boolean flag=true;

    //计数器
    int time=0;
    //3.创建一个启动方法，用来设置窗口信息
    public void start(){
        //4.设置窗口是否可见
        this.setVisible(true);
        //5.设置窗口大小
        this.setSize(this.width,this.height);
        //6.设置窗口是否可变
        this.setResizable(false);
        //7.设置窗口位置是否居中
        this.setLocationRelativeTo(null);
        //8.设置窗口标题
        this.setTitle("东湖学院大鱼吃小鱼游戏");
        //9.设置窗口关闭按钮
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //4_1启动页面的点击事件,为页面添加点击事件
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //4_2通过流程控制语句if判断是否鼠标左键点击，并进入游戏状态。
                //4_3鼠标左键对应的数值为1
                if (e.getButton()==1 && state==0){
                    state=1;
                    //4_3repaint方法再次调用paint方法，将窗口描绘出来
                    repaint();
                }
                //在游戏状态为结束或者胜利的情况下点击鼠标左键重新开始
                if (e.getButton()==1&&(state==2||state==3)){
                    reGame();
                    state=1;
                }
            }
        });
        //控制我方鱼键盘移动
        this.addKeyListener(new KeyAdapter() {
            //键盘按压
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                //判断WASD
                if (e.getKeyCode()==87) {
                    GameUtils.UP=true;
                }
                if (e.getKeyCode()==83) {
                    GameUtils.DOWN=true;
                }
                if (e.getKeyCode()==65) {
                    GameUtils.LEFT=true;
                }
                if (e.getKeyCode()==68) {
                    GameUtils.RIGHT=true;
                }

                //按z胜利
                if (e.getKeyCode()==90){
                    GameUtils.count=999;
                    GameUtils.level=99;
                    myFish.level=99;
                    myFish.width=500;
                    myFish.height=400;
                    state=3;
                }

                //按空格暂停
                if (e.getKeyCode()==32){
                    switch (state){
                        case 1:
                            state=4;
                            break;
                        case 4:
                            state=1;
                            break;
                    }

                }

            }
            //键盘释放
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                //判断WASD
                if (e.getKeyCode()==87) {
                    GameUtils.UP=false;
                }
                if (e.getKeyCode()==83) {
                    GameUtils.DOWN=false;
                }
                if (e.getKeyCode()==65) {
                    GameUtils.LEFT=false;
                }
                if (e.getKeyCode()==68) {
                    GameUtils.RIGHT=false;
                }
            }
        });

    /*5-5定义背景图片的循环使用，需要重复调用paint方法，所以在start方法中添加一个while循环。每隔40毫秒调用一次*/
        while(true){
            repaint();
            time++;
            try {
                //多线程
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    //13.重写paint方法
    @Override
    public void paint(Graphics g) {//绘制的方法

        //6-3懒加载模式实现初始化对象
        offScreenimg=createImage(width,height);
        Graphics gImage=offScreenimg.getGraphics();

        //加载背景图片
        bg.paintSelf(gImage,myFish.level);

        //16.在paint方法中，用switch语句来定义游戏状态
        switch(state){
            case 0:
//                //17.在游戏状态为0的时候，设置启动页面背景图片
//                gImage.drawImage(GameUtils.bgimg,0,0,null);
//                //18.将画笔颜色改为白色
//                gImage.setColor(Color.white);
//                //19.设置字体样式
//                gImage.setFont(new Font("仿宋",Font.BOLD,70));
//                //20.为启动页面添加文字
//                gImage.drawString("开始",700,500);

                break;
            case 1:
                myFish.paintSelf(gImage);
//                gImage.setColor(Color.red);
//                gImage.setFont(new Font("仿宋",Font.BOLD,50));
//                gImage.drawString("积分："+GameUtils.count,200,120);
//                myFish.paintSelf(gImage);
                //鱼类控制
                logic();
                //打印鱼类
                for (Enamy enamy:GameUtils.enamyList) {
                    enamy.paintSelf(gImage);
                }

                //boos鱼来时提示
                if (isboss){
                    boss.x=boss.x+boss.dir*boss.speed;
                    boss.paintSelf(gImage);
                    if (boss.x<0){
                        gImage.setColor(Color.red);
                        gImage.fillRect(boss.x,boss.y,2400,boss.height/30);
                    }
                }
                //删除鱼，防止数组过大。
//                removeFish();
                break;
            case 2:
                for(Enamy enamy:GameUtils.enamyList){
                    enamy.paintSelf(gImage);
                }
                break;
            case 3:
                myFish.paintSelf(gImage);
//                gImage.setColor(Color.red);
//                gImage.setFont(new Font("仿宋",Font.BOLD,50));
//                gImage.drawString("积分："+GameUtils.count,400,400);
//                gImage.drawString("胜利："+GameUtils.count,400,500);
                break;
            case 4:

                break;
        }
        //14.使用画笔g绘制图片
        g.drawImage(offScreenimg,0,0,null);
    }



    //9-2鱼类控制
    void logic(){

        //调用关卡难度方法
        checkLevel();
        upLevel();

        int rand=random.nextInt(2);
        //根据关卡生成鱼
        switch(GameUtils.level){
            case 4:
                if (time%60==0){
                    if (rand>0){
                        boss=new Enamy_Boos();
                        isboss=true;
                    }
                }
            case 3:
            case 2:
                if (time%30==0){
                    if (rand==0){
                        enamy=new Enamy_3_L();
                    }else {
                        enamy=new Enamy_3_R();
                    }
                    GameUtils.enamyList.add(enamy);
                }

            case 1:
                if (time%20==0){
                    if (rand==0){
                        enamy=new Enamy_2_L();
                    }else {
                        enamy=new Enamy_2_R();
                    }
                    GameUtils.enamyList.add(enamy);
                }

            case 0:
                if (time%10==0){
                    if (rand==0){
                        enamy=new Enamy_1_L();
                    }else {
                        enamy=new Enamy_1_R();
                    }
                    GameUtils.enamyList.add(enamy);
                }

                break;

        }
        //每调用10次time添加三条鱼
        if (time%20==0){
//            enamy=new Enamy().new Enamy_1_L();
//            GameUtils.enamyList.add(enamy);

            //随机添加一条鱼。

        }
        for (Enamy enamy:GameUtils.enamyList) {
            enamy.x=enamy.x+enamy.dir*enamy.speed;
            if (isboss){
                if (boss.grtRec().intersects(enamy.grtRec())){
                    enamy.x=-200;
                    enamy.y=-200;
                }
                if (boss.grtRec().intersects(myFish.grtRec())){
                    state=2;
                }
            }
            //我方鱼于敌方鱼的碰撞检测
            if (myFish.grtRec().intersects(enamy.grtRec())){
//                System.out.println("发生碰撞了");
                if (myFish.level>=enamy.type){
                    //移除敌方鱼，*注意这里不能用数组删除法来移除，因为线程不安全。
                    enamy.x=-200;
                    enamy.y=-200;
                    //完成检测后，积分加1
                    GameUtils.count=GameUtils.count+enamy.count;
                }else{
                    state=2;
                }
            }
        }

    }
    //删除鱼的数量
    private void removeFish() {
        //如果鱼的数量大于15条删除一条
        if (GameUtils.enamyList.size()>15){
            GameUtils.enamyList.remove(0);
        }
    }
    //重新开始
    public void reGame(){
        //敌方鱼清零
        GameUtils.enamyList.clear();

        //计时器清零
        time=0;
        //我放鱼等级
        myFish.level=1;
        //分值
        GameUtils.count=0;
        //我方鱼初始化
        myFish.x=700;
        myFish.y=500;
        myFish.height=50;
        myFish.width=50;
        boss=null;
        //boss鱼为未出现
        isboss=false;



    }


    //检测关卡难度
    public void checkLevel(){
        //关卡的难度
        if (GameUtils.count<5){
            GameUtils.level=0;
            myFish.level=1;
        }else if (GameUtils.count<=15){
            GameUtils.level=1;
        }else if (GameUtils.count<=25){
            GameUtils.level=2;
            myFish.level=1;
        }else if (GameUtils.count<=45){
            GameUtils.level=3;
            myFish.level=2;
        }else if (GameUtils.count<=50){
            myFish.level=3;
        }else if (GameUtils.count<=80){
            GameUtils.level=4;
        }else if (GameUtils.count>=90){
            state=3;
            repaint();
        }
    }

    //升级鱼
    public void upLevel(){
        if (myFish.level==1&&flag){
            myFish.width+=10;
            myFish.height+=10;
            myFish.speed+=3;
            flag=false;
        }else if(myFish.level==2&&flag==false){
            myFish.width+=30;
            myFish.height+=30;
            myFish.speed+=3;
            flag=true;
        }else if (myFish.level==3&&flag){
            myFish.width+=60;
            myFish.height+=60;
            myFish.speed+=3;
            flag=false;
        }


    }



    //10.创建main方法
    public static void main(String[] args){
        GameWin gameWin=new GameWin();
        gameWin.start();


    }

}
