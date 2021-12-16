package com.duhaiqing.flower.entity;

public class FlowerEntity {
    /**
     * 鲜花编号
     */
    private String id;
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

    public FlowerEntity(String id, String flowerName, int flowerCount, double flowerPrice, String saleDate, String salesPerson, String remark) {
        this.id = id;
        this.flowerName = flowerName;
        this.flowerCount = flowerCount;
        this.flowerPrice = flowerPrice;
        this.saleDate = saleDate;
        this.salesPerson = salesPerson;
        this.remark = remark;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
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
                "\t\t" + flowerCount +
                "\t\t\t" + flowerPrice +
                "\t\t" + saleDate  +
                "\t\t" + salesPerson +
                "\t\t" + remark;
    }
}



