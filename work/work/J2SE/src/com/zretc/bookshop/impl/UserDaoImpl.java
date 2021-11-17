package com.zretc.bookshop.impl;

import com.zretc.bookshop.dao.BaseDao;
import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.entity.AllBook;
import com.zretc.bookshop.entity.UserEntity;

public class UserDaoImpl extends BaseDao implements UserDao {

	//用户登录
	@Override
	public UserEntity login(String userName, String pwd) {
		// TODO 自动生成的方法存根
		//1.遍历数组
		//2.用户输入的用户名和数组里的用户名比较
		
		UserEntity[] users =getUsers();
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUserName())&& pwd.equals(users[i].getUserPwd())) {
				//3.找到满足的对象
				return users[i];
			}
		}
		
		return null;
	}

	

	//修改登录密码
	@Override
	public boolean updatePwd(UserEntity user, String userPwd1, String userPwd2) {
		// TODO 自动生成的方法存根
		//判断是否与原密码相等
		if(userPwd1.equals(userPwd2)) {
			return false;
		}
		UserEntity[] users=getUsers();
		for(int i=0;i<users.length;i++) {
			if(users[i].getUserId().equals(user.getUserId())) {
				users[i].setUserPwd(userPwd2);
				return true;
			}
		}
		
		return false;
	}
	
	//查看全部图书
	public AllBook[] checkAll() {
		
		for(int i=0;i<book.length;i++) {
			
		}
		return ;
	}

}
