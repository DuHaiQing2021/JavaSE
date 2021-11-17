package com.zretc.bookshop.ui;

import java.util.Scanner;

import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.service.UserService;
import com.zretc.bookshop.service.impl.UserServicelmpl;
//UI层
public class Test {
	
	public static void main(String[] args) {
	
		//创建业务逻辑层实现类的对象
		UserService userService =new UserServicelmpl();
		Scanner sc=new Scanner(System.in);
		loop1:while(true) {
			System.out.println("----欢迎来到图书商城管理系统--------");
			System.out.println("1.登录\n2.退出系统\n请选择：");
			int num =sc.nextInt();
			sc.nextLine();
			if(num==1) {
				loop2:while(true) {
					System.out.println("请输入用户名：");
					String userName=sc.next();
					System.out.println("请输入密码：");
					String pwd=sc.next();
					//调用方法
					UserEntity user= userService.login(userName, pwd);
					//看
					if(user!=null) {
						//登陆成功
						System.out.println("欢迎您登录！");
						System.out.println("用户编号："+user.getUserId()+"\t用户名："+user.getUserName());
						loop3:while(true) {						
							System.out.println("1.修改密码\t2.查看所有图书\t3.退出登录\t4.退出系统");
							int choose=sc.nextInt();
							if(choose==1) {
								//修改密码
								System.out.println("请输入原密码：");
								String newPwd1= sc.next();
								System.out.println("请输入新密码：");
								String newPwd2= sc.next();
								boolean flag=userService.updatePwd(user, newPwd1, newPwd2);
								System.out.println(flag?"修改成功":"修改失败");
							}else if(choose==2) {
								//查看所有图书
							}else if(choose==3) {
							
								//退出登录
								break loop2;
							}else if(choose== 4) {
								System.out.println("谢谢使用系统");
								//退出系统
								break loop1;
							}

						}
					}else {
							System.out.println("请输入正确的密码！");
							continue;
					}
						
				}
					
					
			}else if(num==2){
				System.out.println("谢谢使用系统");
				break loop1;
			}
			
		}
		
	}
	

}
