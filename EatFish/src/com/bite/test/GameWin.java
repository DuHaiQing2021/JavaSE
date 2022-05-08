package com.bite.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//窗口的创建
//1_1.使用java创建一个窗口
//1_2创建一个普通的java类，然后继承JFrame类成为一个窗口类。
public class GameWin extends JFrame {
    /*游戏状态分为 5种: 0未开始 1游戏中 2通关失败 3通关成功  4暂停*/
    public int state = 0;
    //15.设置游戏默认状态
    protected int width=1440;
    protected int height=900;

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
            }
        });
    /*5-5定义背景图片的循环使用，需要重复调用paint方法，所以在start方法中添加一个while循环。每隔40毫秒调用一次*/
        while(true){
            //多线程
            repaint();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    //13.重写paint方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //14.使用画笔g绘制图片
        g.drawImage(GameUtils.bgimg,0,0,null);

        //16.在paint方法中，用switch语句来定义游戏状态
        switch(state){
            case 0:
                //17.在游戏状态为0的时候，设置启动页面背景图片
                g.drawImage(GameUtils.bgimg,0,0,null);
                //18.将画笔颜色改为红色
                g.setColor(Color.white);
                //19.设置字体样式
                g.setFont(new Font("仿宋",Font.BOLD,70));
                //20.为启动页面添加文字
                g.drawString("开始",700,500);break;
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    //10.创建main方法
    public static void main(String[] args){
        GameWin gameWin=new GameWin();
        gameWin.start();


    }

}
