package com.bite.test;

import java.awt.*;


//7-2创建敌方鱼类
public  class Enamy {
    //定义图片
    Image image;
    //坐标
    int x;
    int y;
    //体积
    int width;
    int height;
    //速度
    int speed;
    //类型
    int type;
    //游动方向

    int dir = 1;
    //积分
    int count;

    //绘制自身的方法
    public void paintSelf(Graphics g) {
        g.drawImage(image, x, y, width, height, null);
    }

    //碰撞检测的方法
    public Rectangle grtRec(){
        return  new Rectangle(x,y,width,height);
    }


}
    //敌方鱼类的左类
class Enamy_1_L extends Enamy{
    Enamy_1_L(){
            this.x=0;
            this.y=(int)(Math.random()*700+100);
            this.width=45;
            this.height=69;
            this.speed=10;
            this.count=1;
            this.type=1;
            this.image=GameUtils.enamy1_RImg;

        }
        @Override
        public Rectangle grtRec(){
            return  new Rectangle(x,y,width-20,height-30);
        }

    }
class Enamy_2_L extends Enamy{
    Enamy_2_L(){
            this.x=0;
            this.y=(int)(Math.random()*700+100);
            this.width=69;
            this.height=69;
            this.speed=15;
            this.count=2;
            this.type=2;
            this.image=GameUtils.enamy2_RImg;

        }
    @Override
    public Rectangle grtRec(){
        return  new Rectangle(x,y,width-30,height-30);
    }

}
class Enamy_3_L extends Enamy{
    Enamy_3_L(){
            this.x=0;
            this.y=(int)(Math.random()*700+100);
            this.width=150;
            this.height=69;
            this.speed=20;
            this.count=5;
            this.type=3;
            this.image=GameUtils.enamy3_RImg;

    }
    @Override
    public Rectangle grtRec(){
        return  new Rectangle(x+40,y+30,width-80,height-60);
    }
}

    //敌方鱼类的右类
class Enamy_1_R extends Enamy_1_L{
    Enamy_1_R(){
            this.x=new GameWin().width;
            this.dir=-1;
            this.image=GameUtils.enamy1_LImg;

    }
}
class Enamy_2_R extends Enamy_2_L{
    Enamy_2_R(){
            this.x=new GameWin().width;
            this.dir=-1;
            this.image=GameUtils.enamy2_LImg;

    }
}
class Enamy_3_R extends Enamy_3_L{
    Enamy_3_R(){
            this.x=new GameWin().width;
            this.dir=-1;
            this.image=GameUtils.enamy3_LImg;
    }
}
class  Enamy_Boos extends Enamy{
    Enamy_Boos(){
        this.x=-1000;
        this.y=(int)(Math.random()*700+100);
        this.width=300;
        this.height=300;
        this.speed=100;
        this.count=10;
        this.type=10;
        this.image=GameUtils.enamy_Boos_RImg;


    }
    @Override
    public Rectangle grtRec(){
        return  new Rectangle(x+40,y+30,width-150,height-150);
    }

}

