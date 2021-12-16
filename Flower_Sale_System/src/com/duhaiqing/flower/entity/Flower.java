package com.duhaiqing.flower.entity;

/**
 * @Description TODO
 * @Author caojie
 * @Date 2020/9/7 9:43
 * @Version 1.0
 **/
public class Flower {
    /**
     * 鲜花编号
     */
    private int id;
    private String flowerName;
    /**
     * 鲜花数量
     */
    private int flowerCount;
    /**
     * 鲜花价格
     */
    private double flowerPrice;
    /**
     * 销售日期
     */
    private String saleDate;
    /**
     销售员
     */
    private String salesPerson;
    /**
     * 备注
     */
    private String remark;

    public Flower(int id, String flowerName, int flowerCount, double flowerPrice, String saleDate, String salesPerson, String remark) {
        this.id = id;
        this.flowerName = flowerName;
        this.flowerCount = flowerCount;
        this.flowerPrice = flowerPrice;
        this.saleDate = saleDate;
        this.salesPerson = salesPerson;
        this.remark = remark;
    }

    public Flower() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getFlowerCount() {
        return flowerCount;
    }

    public void setFlowerCount(int flowerCount) {
        this.flowerCount = flowerCount;
    }

    public double getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(double flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return  id +
                "\t" + flowerName  +
                "\t" + flowerCount +
                "\t" + flowerPrice +
                "\t\t" + saleDate  +
                "\t" + salesPerson +
                "\t" + remark;
    }
}
