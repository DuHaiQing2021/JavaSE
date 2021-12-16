package com.duhaiqing.flower.service.impl;

import com.duhaiqing.flower.dao.FlowerDao;
import com.duhaiqing.flower.dao.impl.FlowerDaoImpl;
import com.duhaiqing.flower.service.FlowerService;

public class FlowerServiceImpl implements FlowerService {
    FlowerDao flowerDao=new FlowerDaoImpl();


    @Override
    public void checkAllFlowers() {
        flowerDao.checkAllFlowers();
    }

    @Override
    public void updateFlower() {
        flowerDao.updateFlower();
    }

    @Override
    public void deleteFlowerById() {
        flowerDao.deleteFlowerById();
    }
}
