package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDemo  {

    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        //放置一个元素，<K,V>K表示主键或名,V表示值。
        map.put("国民女神","高圆圆");
        map.put("及时雨","宋江");
        System.out.println(map);

        //根据指定值的K查找对应的V，没有找到用默认值代替
        String ret=map.getOrDefault("及时雨2","博哥");
        System.out.println(ret);

        //查看hash表中有没有该主键，有返回true没有返回false
        boolean flag1=map.containsKey("及时雨");
        System.out.println(flag1);
        //查看hash表中有没有该值，。。。。
        boolean flag2=map.containsValue("宋");
        System.out.println(flag2);





    }
}

