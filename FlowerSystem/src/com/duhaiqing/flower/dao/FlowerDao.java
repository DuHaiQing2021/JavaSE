package com.duhaiqing.flower.dao;

import com.duhaiqing.flower.entity.FlowerEntity;

import java.util.List;

//数据访问层中系统功能相关的接口
public interface FlowerDao {
    /**
     * 查询所有的鲜花
     */
    public void checkAllFlowers();

    /**
     * 修改鲜花
     */
    public void updateFlower();

    /**
     * 删除鲜花
     */
    public void deleteFlowerById();


}
