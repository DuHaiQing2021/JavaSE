package com.zretc.bookshop.dao;

import com.zretc.bookshop.entity.AllBook;
import com.zretc.bookshop.entity.UserEntity;

//���ݷ��ʲ��е��û���صĽӿ�
public interface UserDao {
	
	//��¼
	public abstract  UserEntity login(String userName,String userPwd);
	//�޸�����
	public abstract boolean updatePwd(UserEntity user,String userPwd1,String userPwd2);
	//�鿴ȫ��ͼ��
	public abstract AllBook[] checkAll();
}