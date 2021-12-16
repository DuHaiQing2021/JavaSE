package com.duhaiqing.flower.view;

import com.duhaiqing.flower.service.FlowerService;
import com.duhaiqing.flower.service.impl.FlowerServiceImpl;

import java.util.Scanner;

//视图层
public class FlowerView {
    /**
     * 鲜花管理系统的业务逻辑层
     */
    FlowerService service = new FlowerServiceImpl();

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new FlowerView().start();
    }

    /**
     * 启动鲜花管理系统
     */
    private void start() {
        while(true){
            System.out.println("=================欢迎光临“七彩鲜花”销售管理系统=================");
            System.out.println("1查询销售订单");
            System.out.println("2修改销售订单");
            System.out.println("3删除销售订单");
            System.out.println("4系统推出");
            // 输入的菜单项
            System.out.println("请选择功能：");
            int menuNum = input.nextInt();
            switch (menuNum){
                case 1:
                    service.checkAllFlowers();
                    break;
                case 2:
                    service.updateFlower();
                    break;
                case 3:
                    service.deleteFlowerById();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
}
