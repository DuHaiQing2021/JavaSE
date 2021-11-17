package com.zretc.bookshop.dao;

import com.zretc.bookshop.entity.AllBook;
import com.zretc.bookshop.entity.UserEntity;

//用来初始化实体类的数据
public class BaseDao {
	//创建用户数据
	static UserEntity[] users=new UserEntity[3];

	
	static {
		UserEntity user1=new UserEntity("D1","za","112");
		UserEntity user2=new UserEntity("D2","zb","112");
		UserEntity user3=new UserEntity("D3","zc","112");
		users[0]=user1;
		users[1]=user2;
		users[2]=user3;
		
	}
	public static UserEntity[] getUsers() {
		return users;
	}
	
	//创建书库数据
	static AllBook[] allBook=new AllBook[3];
	
	static{
		AllBook book1=new AllBook("格林童话", "DD2");
		AllBook book2=new AllBook("人间失格", "DD5");
		AllBook book3=new AllBook("哈姆雷特", "DD6");
		allBook[0]=book1;
		allBook[1]=book2;
		allBook[2]=book3;
	}
	
}
