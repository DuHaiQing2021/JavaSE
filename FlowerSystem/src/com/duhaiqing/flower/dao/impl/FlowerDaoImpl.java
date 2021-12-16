package com.duhaiqing.flower.dao.impl;

import com.duhaiqing.flower.dao.BaseDao;
import com.duhaiqing.flower.dao.FlowerDao;
import com.duhaiqing.flower.entity.FlowerEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerDaoImpl extends BaseDao implements FlowerDao {
    /**
     * 查询所有的鲜花
     * @return所有的鲜花
     */
    @Override
    public void checkAllFlowers() {
        List<FlowerEntity> temp=super.getFlowers();
        System.out.println("编号\t    鲜花名称\t    销售数量\t    价格\t\t    销售日期\t\t    销售员\t\t备注");
        for (FlowerEntity x:temp) {
            System.out.println(x);
        }
    }

    /**
     * 修改鲜花
     */
    @Override
    public void updateFlower() {
        List<FlowerEntity> temp=super.getFlowers();
        Scanner scanner=new Scanner(System.in);
        int i=0;
        System.out.println("请输入商品的销售编号");
        String index=scanner.next();
        for (i=0;i<temp.size();i++) {
            if (index.equals(temp.get(i).getId())){
                System.out.println("你要修改的订单详情如下：");
                System.out.println("编号\t    鲜花名称\t    销售数量\t    价格\t\t    销售日期\t\t    销售员\t\t备注");
                System.out.println(temp.get(i));
                System.out.println("请输入修改后的鲜花名称：");
                String flowerName=scanner.next();
                System.out.println("请输入修改后的销售数量：");
                int flowerCount=scanner.nextInt();
                System.out.println("请输入修改后的鲜花价格：");
                double flowerPrice=scanner.nextDouble();
                System.out.println("请输入修改后的销售日期：(yyyy-MM-dd)");
                String saleDate=scanner.next();
                System.out.println("请输入修改后的销售员：");
                String salePerson=scanner.next();
                System.out.println("请输入修改后的备注信息：");
                String remark=scanner.next();
                System.out.println("请确认是否修改（y/n）：");
                String flag=scanner.next();
                if (flag.equals("y")){
                    temp.get(i).setFlowerName(flowerName);
                    temp.get(i).setFlowerCount(flowerCount);
                    temp.get(i).setFlowerPrice(flowerPrice);
                    temp.get(i).setSaleDate(saleDate);
                    temp.get(i).setSalesPerson(salePerson);
                    temp.get(i) .setRemark(remark);
                    System.out.println("修改成功！");
                    System.out.println(temp.get(i));
                    break;
                }else if (flag.equals("n")){
                    System.out.println("取消修改");
                    break;
                }else {
                    System.out.println("输入有误，修改失败");
                    break;
                }
            }

            }
        if(i==temp.size()){
            System.out.println("您要删除的订单不存在！");
        }


    }

    /**
     * 删除鲜花
     */
    @Override
    public void deleteFlowerById() {
        List<FlowerEntity> temp=super.getFlowers();
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.println("请输入要删除的订单编号：");
        String flowerId=scanner.next();
        for (FlowerEntity x:temp) {
            if (x.getId().equals(flowerId)) {
                System.out.println("编号\t    鲜花名称\t    销售数量\t    价格\t\t    销售日期\t\t    销售员\t\t备注");
                System.out.println(x);
                System.out.println("确定要删除吗？（y/n）：");
                String flag = scanner.next();
                if (flag.equals("y")) {
                    temp.remove(x);
                    System.out.println("删除成功！");
                    break;
                } else if (flag.equals("n")) {
                    System.out.println("取消删除！");
                    break;
                } else {
                    System.out.println("输入有误，删除失败！");
                    break;
                }

            }
            count++;
        }
        if (count>=temp.size()){
            System.out.println("您要删除的订单不存在！");

        }
    }

}



