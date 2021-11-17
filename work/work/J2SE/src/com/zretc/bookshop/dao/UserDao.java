package com.zretc.bookshop.dao;

import com.zretc.bookshop.entity.AllBook;
import com.zretc.bookshop.entity.UserEntity;

//数据访问层中的用户相关的接口
public interface UserDao {
	
	//登录
	public abstract  UserEntity login(String userName,String userPwd);
	//修改密码
	public abstract boolean updatePwd(UserEntity user,String userPwd1,String userPwd2);
	//查看全部图书
	public abstract AllBook[] checkAll();
}
