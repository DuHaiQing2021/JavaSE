package com.zretc.bookshop.ui;

import java.util.Arrays;
import java.util.Scanner;

import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.service.UserService;
import com.zretc.bookshop.service.impl.UserServiceImpl;

//ui视图层
//流程控制+调用业务方法(调用业务逻辑层实现类的方法)
public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//业务逻辑层实现的对象
		UserService user = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		//系统执行流程
		loop1:while(true) {
			System.out.println("******************************************");
			System.out.println("****           欢迎来到图书系统          ****");
			System.out.println("****  1.用户登录 2.管理员登录  3.退出系统  ****");
			System.out.println("******************************************");
			System.out.print("请选择》》》");
			int num = sc.nextInt();
			if(num == 1) {
				//用户登录操作
				loop2:while(true) {
					System.out.print("请输入用户名：");
					String userName = sc.next();
					System.out.print("请输入密码：");
					String userPwd = sc.next();
					//调用方法
					UserEntity user1 = user.login(userName, userPwd);
						if(user1 != null) {
							if(user1.getIdentity() == 0){
								System.out.println("=======================普通用户登录成功！=======================");
								System.out.println("编号："+user1.getUserId()+"用户名："+user1.getUserName());
								int x = userMenu(user,user1);
								if(x == -2){
									break loop2;
								}else if(x == -1){
									break loop1;
								}
							}else {
								System.out.println("该用户不是普通用户！");
								break loop2;
							}

						}else {
							System.out.println("用户名或密码错误，请重新输入！");
							break loop2;
						}
				}
			}else if(num == 2) {
				//管理员登录操作
				loop2:while(true) {
					System.out.print("请输入用户名：");
					String userName = sc.next();
					System.out.print("请输入密码：");
					String userPwd = sc.next();
					//调用方法
					UserEntity user1 = user.login(userName, userPwd);
					if(user1 != null) {
						if(user1.getIdentity() == 1){
							System.out.println("=====================================管理员登录成功！=====================================");
							System.out.println("编号："+user1.getUserId()+"用户名："+user1.getUserName());
							int a = adminMenu(user,user1);
							if(a == -2){
								break loop2;
							}else if(a == -1){
								break loop1;
							}
						}else {
							System.out.println("该用户不是管理员");
							break loop2;
						}

					}else {
						System.out.println("用户名或密码错误，请重新输入！");
						break loop2;
					}
				}
			}else if (num==3){
				System.exit(0);
			} else {
				System.out.println("选择有误，请重新输入！！！");
			}
		}
	}
	//用户登录
	public static int userMenu(UserService user,UserEntity user1){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.修改密码\t2.注册\t3.显示图书信息\t4.退出登陆\t5.退出系统");
			System.out.print("请选择：");
			int ret = sc.nextInt();
			if(ret == 1) {
				//修改密码
				System.out.print("请输入新密码：");
				String newP1 = sc.next();
				System.out.print("请再次输入新密码：");
				String newP2 = sc.next();
				
				boolean flag = user.updatePwd(user1,newP1,newP2);
				System.out.println(flag?"修改成功":"修改失败");
				if(flag) {
					break;
				}
			}else if(ret == 2) {
				//注册
				System.out.print("请输入需要注册的用户名：");
				String name = sc.next();
				System.out.print("请输入需要注册的密码：");
				String pwd = sc.next();
				boolean flag = user.userRegister(name, pwd);
				System.out.println(flag?"注册成功":"注册失败");
				if(flag) {
					break;
				}
			}else if(ret == 3){
				//显示所有图书信息
				user.bookDisplay();
			}else if(ret == 4) {
				//退出登陆
				return -2;
			}else if(ret == 5) {
				//退出系统
				System.out.println("欢迎下次光临");
				return -1;
			}else {
				System.out.println("输入有误，请重新输入！");
			}
		}
		return 0;
	}
	//管理员登录
	public static int adminMenu(UserService user,UserEntity user1){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.修改密码\t2.注册用户\t3.显示图书\t4.显示用户\t5.删除用户\t6.退出登录\t7.退出系统");
			System.out.print("请选择：");
			int ret = sc.nextInt();
			if(ret == 1) {
				//修改密码
				System.out.print("请输入新密码：");
				String newP1 = sc.next();
				System.out.print("请再次输入新密码：");
				String newP2 = sc.next();

				boolean flag = user.updatePwd(user1,newP1,newP2);
				System.out.println(flag?"修改成功":"修改失败");
				if(flag) {
					break;
				}
			}else if(ret == 2) {
				//注册
				System.out.print("请输入需要注册的用户名：");
				String name = sc.next();
				System.out.print("请输入需要注册的密码：");
				String pwd = sc.next();
				boolean flag = user.userRegister(name, pwd);
				System.out.println(flag?"注册成功":"注册失败");
				if(flag) {
					break;
				}
			}else if(ret == 3){
				//显示所有图书信息
				user.bookDisplay();
			}else if(user1.getIdentity()==1&&ret == 4){
				//显示用户信息
				user.display();
			}else if(user1.getIdentity()==1&&ret == 5){
				System.out.println("请输入所需删除用户的编号：");
				int n = sc.nextInt();
				//删除用户
				System.out.println(user.remove(n)?"删除成功》》":"删除失败！");
			}else if(ret == 6) {
				//退出登陆
				return -2;
			}else if(ret == 7) {
				//退出系统
				System.out.println("欢迎下次光临");
				return -1;
			} else {
				System.out.println("输入错误，重新输入！");
			}
		}
		return 0;
	}

}
