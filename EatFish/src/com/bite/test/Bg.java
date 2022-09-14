package com.bite.test;

import java.awt.*;

/**
 * 5.游戏开始时的背景添加
 * 5—1创建一个背景图片的实体类
 */
public class Bg {
    //5—2编写绘制图片的方法
    void paintSelf(Graphics g,int fishLevel){
        //5-3在绘制方法中定义所需参数
        g.drawImage(GameUtils.bgimg,0,0,null);
        switch(GameWin.state){
            case 0:
                GameUtils.drawWrod(g,"开始",Color.red,80,700,500);
                break;
            case 1:
                GameUtils.drawWrod(g,"积分"+GameUtils.count,Color.RED,50,200,120);
                GameUtils.drawWrod(g,"难度"+GameUtils.level,Color.RED,50,400,120);
                GameUtils.drawWrod(g,"等级"+fishLevel,Color.RED,50,600,120);
                break;
            case 2:
                GameUtils.drawWrod(g,"积分"+GameUtils.count,Color.RED,50,200,120);
                GameUtils.drawWrod(g,"难度"+GameUtils.level,Color.RED,50,400,120);
                GameUtils.drawWrod(g,"等级"+fishLevel,Color.RED,50,600,120);
                GameUtils.drawWrod(g,"失败",Color.RED,50,720,450);
                break;
            case 3:
                GameUtils.drawWrod(g,"积分"+GameUtils.count,Color.RED,50,200,120);
                GameUtils.drawWrod(g,"难度"+GameUtils.level,Color.RED,50,400,120);
                GameUtils.drawWrod(g,"等级"+fishLevel,Color.RED,50,600,120);
                GameUtils.drawWrod(g,"胜利",Color.RED,50,720,450);
                break;
            case 4:
                GameUtils.drawWrod(g,"游戏暂停！",Color.RED,50,720,450);
                break;


        }
    }
}
