package com.duhaiqing.flower.service;

import com.duhaiqing.flower.entity.Flower;

/**
 * 鲜花管理系统的业务逻辑
 * 查询所有、修改鲜花、删除鲜花、根据id获取对应鲜花
 */
public interface FlowerService {

    /**
     * 查询所有的鲜花
     * @return所有的鲜花
     */
    Flower[] listFlowers();

    /**
     * 修改鲜花
     * @param flower 鲜花实体信息
     */
    void updateFlower(Flower flower);

    /**
     * 删除鲜花
     * @param id
     */
    void deleteFlowerById(int id);

    Flower getFlowerById(int id);
}
