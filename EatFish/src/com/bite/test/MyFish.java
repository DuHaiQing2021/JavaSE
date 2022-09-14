package com.bite.test;

import java.awt.*;

//我方鱼类
public class MyFish {

    //定义图片
    Image image=GameUtils.my1_LImg;

    //初始坐标
    int x=700;
    int y=500;

    //初始体积
    int width=50;
    int height=50;
    //初始速度
    int speed=20;
    //等级
    int level=0;


    //绘制自身的方法
    public void paintSelf(Graphics g){
        controlFish();
        g.drawImage(this.image,x,y,width,height,null);
    }
    //获取自身矩形碰撞检测的方法
    public Rectangle grtRec(){
        return  new Rectangle(x,y,width,height);
    }



    //键盘控制我方鱼的游动
    void controlFish(){
        if (GameUtils.UP){
            y=y-speed;
        }
        if (GameUtils.DOWN){
            y=y+speed;
        }
        if (GameUtils.LEFT){
            x=x-speed;
            image=GameUtils.my1_LImg;
        }
        if (GameUtils.RIGHT){
            x=x+speed;
            image=GameUtils.my1_RImg;
        }
    }

}
