package com.duhaiqing.flower.dao;

import com.duhaiqing.flower.entity.FlowerEntity;
import com.duhaiqing.flower.service.FlowerService;

import java.util.ArrayList;
import java.util.List;

//初始化实体类的数据
public class BaseDao {
    //存放商品信息的实体对象
    static List<FlowerEntity> flowers = new ArrayList<>();

    //初始化商品信息对象
    static{
        flowers.add(new FlowerEntity("1001","香槟玫瑰",10,318.0,"2021-12-16","王二狗",""));
        flowers.add(new FlowerEntity("1002","白玫瑰",99,538.0,"2021-12-16","王二狗",""));
        flowers.add(new FlowerEntity("1003","紫色桔梗",40,148.0,"2021-12-16","杜海庆","紫色花"));
        flowers.add(new FlowerEntity("1004","粉香百合",120,188.0,"2021-12-16","刘德华","粉色花"));
        flowers.add(new FlowerEntity("1005","无声的爱",150,219.0,"2021-12-16","杜海庆","爱你，胜过爱爱情，胜过爱自己"));
    }

    public List<FlowerEntity> getFlowers(){
        return flowers;
    }
}
