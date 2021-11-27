package com.zretc.bookshop.impl;

import com.zretc.bookshop.dao.BaseDao;
import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.entity.AllBook;
import com.zretc.bookshop.entity.UserEntity;

public class UserDaoImpl extends BaseDao implements UserDao {

	//�û���¼
	@Override
	public UserEntity login(String userName, String pwd) {
		// TODO �Զ����ɵķ������
		//1.��������
		//2.�û�������û�������������û����Ƚ�
		
		UserEntity[] users =getUsers();
		for(int i=0;i<users.length;i++) {
			if(userName.equals(users[i].getUserName())&& pwd.equals(users[i].getUserPwd())) {
				//3.�ҵ�����Ķ���
				return users[i];
			}
		}
		
		return null;
	}

	

	//�޸ĵ�¼����
	@Override
	public boolean updatePwd(UserEntity user, String userPwd1, String userPwd2) {
		// TODO �Զ����ɵķ������
		//�ж��Ƿ���ԭ�������
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
	
	//�鿴ȫ��ͼ��
	public AllBook[] checkAll() {
		
		for(int i=0;i<book.length;i++) {
			
		}
		return ;
	}

}