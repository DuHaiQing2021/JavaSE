package com.duhaiqing.flower.view;

import com.duhaiqing.flower.entity.Flower;
import com.duhaiqing.flower.service.FlowerService;
import com.duhaiqing.flower.service.impl.FlowerServiceImpl;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author caojie
 * @Date 2020/9/7 10:45
 * @Version 1.0
 * 鲜花管理系统的显示层，显示层需要调用业务罗继承
 **/
public class FlowerView {
    /**
     * 鲜花管理系统的业务逻辑层
     */
    private FlowerService service = new FlowerServiceImpl();

    private Scanner input = new Scanner(System.in);

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
            int menuNum = input.nextInt();
            switch (menuNum){
                case 1:
                    findAllFlowers();
                    break;
                case 2:
                    updateFlower();
                    break;
                case 3:
                    deleteFlower();
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

    /**
     * 显示所有的鲜花
     * 步骤：1 调用中间层的listFlowers()方法获取鲜花列表信息
     */
    private void findAllFlowers() {
        Flower[] flowers = service.listFlowers();
        System.out.println("鲜花编号\t鲜花名称\t销售数量\t销售价格\t销售日期\t销售人\t备注");
        // 遍历数组
        for (Flower ff : flowers) {
            if(null == ff){
                continue;
            }
            System.out.println(ff);
        }
    }

    /**
     * 修改鲜花
     * 步骤：
     * 1 输入鲜花编号
     * 2 根据鲜花编号获取对应的鲜花信息
     * 3 如果鲜花信息不存在，提示用户“要修改的鲜花信息不存在”，退出方法
     * 4 如果修改的信息存在，显示信息
     * 5 输入要修改的鲜花名称、数量、价格、日期、销售人、备注
     * 6 确认修改吗
     * 7 输入y 调用业务逻辑层的修改方法进行修改
     * 8 否则 退出方法(不修改)
     * 9 修改成功之后显示修改之后的列表信息
     */
    private void updateFlower() {
        System.out.println("请输入鲜花编号");
        int flowerId = input.nextInt();
        Flower flower = service.getFlowerById(flowerId);
        // 条件成立：表示要修改的鲜花编号在鲜花数组中不存在，退出当前正在执行的方法
        if(null == flower){
            System.out.println("对不起,要修改的鲜花信息不存在");
            return;
        }
        System.out.println("鲜花编号\t鲜花名称\t销售数量\t销售价格\t销售日期\t销售人\t备注");
        System.out.println(flower);
        System.out.println("请输入修改后的鲜花名称");
        String flowerName = input.next();
        System.out.println("请输入修改后的销售数量");
        int saleCount = input.nextInt();
        System.out.println("请输入修改后的销售价格");
        double flowerPrice = input.nextDouble();
        System.out.println("请输入修改后的销售日期");
        String saleDate = input.next();
        System.out.println("请输入修改后的销售人");
        String salesPerson = input.next();
        System.out.println("请输入修改后的备注");
        String remark = input.next();
        System.out.println("您确定要修改吗?");
        String answer = input.next();
        // 条件成立：修改鲜花
        if("y".equals(answer)){
            Flower newFlower = new Flower(flowerId,flowerName,saleCount,flowerPrice,saleDate,salesPerson,remark);
            service.updateFlower(newFlower);
            System.out.println("修改成功");
            // 显示修改之后的鲜花列表信息
            findAllFlowers();
        }
    }

    /**
     * 删除鲜花
     * 步骤：
     * 1 输入鲜花编号
     * 2 调用业务逻辑层根据鲜花编号获取对应的鲜花信息
     * 3 如果鲜花信息不存在，提示用户“要删除的鲜花不存在”
     * 4 如果鲜花信息存在，显示要删除的鲜花信息
     * 5 确认是否要删除
     * 6 如果输入y表示确认删除鲜花
     * 7 调用业务逻辑层的方法deleteFlowerById(id)删除鲜花
     * 8 显示删除之后的鲜花列表
     */
    private void deleteFlower() {
        System.out.println("输入鲜花编号");
        int flowerId = input.nextInt();
        Flower flower = service.getFlowerById(flowerId);
        // 要删除的鲜花不存在
        if(null == flower){
            System.out.println("要删除的鲜花不存在");
            return ;
        }
        // 显示要删除的鲜花信息
        System.out.println("鲜花编号\t鲜花名称\t销售数量\t销售价格\t销售日期\t销售人\t备注");
        System.out.println(flower);
        System.out.println("确定要删除吗？");
        String answer = input.next();
        // 条件成立：删除鲜花
        if("y".equals(answer)){
            service.deleteFlowerById(flowerId);
            System.out.println("删除成功");
            // 显示删除之后的鲜花信息
            findAllFlowers();
        }
    }
}
