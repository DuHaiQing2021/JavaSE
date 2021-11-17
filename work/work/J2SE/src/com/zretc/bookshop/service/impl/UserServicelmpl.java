package com.zretc.bookshop.service.impl;

import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.impl.UserDaoImpl;
import com.zretc.bookshop.service.UserService;

public class UserServicelmpl implements UserService {

	UserDao userdao=new UserDaoImpl();
	
	@Override
	public UserEntity login(String userName, String pwd) {
		// TODO 自动生成的方法存根
		return userdao.login(userName, pwd);
	}

	@Override
	public boolean updatePwd(UserEntity user, String userPwd1, String userPwd2) {
		// TODO 自动生成的方法存根
		return userdao.updatePwd(user, userPwd1, userPwd2);
	}

}
