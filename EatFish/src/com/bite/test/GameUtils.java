package com.bite.test;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//10.创建一个工具类
public class GameUtils {

    //游戏积分的实现
    public static int count=0;

    //游戏关卡等级
    public static int level=0;

    //方向
    static boolean UP=false;
    static boolean DOWN=false;
    static boolean LEFT=false;
    static boolean RIGHT=false;

    //通关按钮
    static boolean GO=false;

    //创建敌方鱼类集合
    public static ArrayList<Enamy> enamyList=new ArrayList<>();
    //创建我方鱼类的积分


    //11.在工具类中定义静态的背景图片
    public static Image bgimg=Toolkit.getDefaultToolkit().createImage("images/sea.jpg");

    //回到GameWin窗口类中重写paint方法

    //7-1敌方鱼类
    public static Image enamy1_RImg=Toolkit.getDefaultToolkit().createImage("images/enemyFish/fish1_r.gif");
    public static Image enamy1_LImg=Toolkit.getDefaultToolkit().createImage("images/enemyFish/fish1_l.gif");
    public static Image enamy2_RImg=Toolkit.getDefaultToolkit().createImage("images/enemyFish/fish2_r.png");
    public static Image enamy2_LImg=Toolkit.getDefaultToolkit().createImage("images/enemyFish/fish2_l.png");
    public static Image enamy3_RImg=Toolkit.getDefaultToolkit().createImage("images/enemyFish/fish3_r.png");
    public static Image enamy3_LImg=Toolkit.getDefaultToolkit().createImage("images/enemyFish/fish3_l.png");


    //我方鱼类
    public static Image my1_RImg=Toolkit.getDefaultToolkit().createImage("images/myFish/myfish_right.gif");
    public static Image my1_LImg=Toolkit.getDefaultToolkit().createImage("images/myFish/myfish_left.gif");


    //boos鱼
    public static Image enamy_Boos_RImg=Toolkit.getDefaultToolkit().createImage("images/enemyFish/boss.gif");

    //绘制文字工具类
    public static  void  drawWrod(Graphics g,String str,Color color,int size,int x,int y){
        g.setColor(color);
        g.setFont(new Font("仿宋",Font.BOLD,size));
        g.drawString(str,x,y);
    }
}
