package com.zretc.bookshop.ui;

import java.util.Scanner;

import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.service.UserService;
import com.zretc.bookshop.service.impl.UserServicelmpl;
//UI��
public class Test {
	
	public static void main(String[] args) {
	
		//����ҵ���߼���ʵ����Ķ���
		UserService userService =new UserServicelmpl();
		Scanner sc=new Scanner(System.in);
		loop1:while(true) {
			System.out.println("----��ӭ����ͼ���̳ǹ���ϵͳ--------");
			System.out.println("1.��¼\n2.�˳�ϵͳ\n��ѡ��");
			int num =sc.nextInt();
			sc.nextLine();
			if(num==1) {
				loop2:while(true) {
					System.out.println("�������û�����");
					String userName=sc.next();
					System.out.println("���������룺");
					String pwd=sc.next();
					//���÷���
					UserEntity user= userService.login(userName, pwd);
					//��
					if(user!=null) {
						//��½�ɹ�
						System.out.println("��ӭ����¼��");
						System.out.println("�û���ţ�"+user.getUserId()+"\t�û�����"+user.getUserName());
						loop3:while(true) {						
							System.out.println("1.�޸�����\t2.�鿴����ͼ��\t3.�˳���¼\t4.�˳�ϵͳ");
							int choose=sc.nextInt();
							if(choose==1) {
								//�޸�����
								System.out.println("������ԭ���룺");
								String newPwd1= sc.next();
								System.out.println("�����������룺");
								String newPwd2= sc.next();
								boolean flag=userService.updatePwd(user, newPwd1, newPwd2);
								System.out.println(flag?"�޸ĳɹ�":"�޸�ʧ��");
							}else if(choose==2) {
								//�鿴����ͼ��
							}else if(choose==3) {
							
								//�˳���¼
								break loop2;
							}else if(choose== 4) {
								System.out.println("ллʹ��ϵͳ");
								//�˳�ϵͳ
								break loop1;
							}

						}
					}else {
							System.out.println("��������ȷ�����룡");
							continue;
					}
						
				}
					
					
			}else if(num==2){
				System.out.println("ллʹ��ϵͳ");
				break loop1;
			}
			
		}
		
	}
	

}