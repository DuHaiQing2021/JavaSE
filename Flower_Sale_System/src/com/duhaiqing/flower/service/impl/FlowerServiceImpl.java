package com.duhaiqing.flower.service.impl;

import com.duhaiqing.flower.entity.Flower;
import com.duhaiqing.flower.service.FlowerService;

/**
 * @Description TODO
 * @Author caojie
 * @Date 2020/9/7 9:49
 * @Version 1.0
 **/
public class FlowerServiceImpl implements FlowerService {

    private Flower[] flowers = new Flower[6];
    /**
     * 鲜花的大小
     */
    private int size;

    public FlowerServiceImpl(){
        initData();
    }

    /**
     * 初始化鲜花数据
     */
    private void initData(){
        flowers[size++] = new Flower(1001,"红玫瑰",10,89.1,"2020-03-09","Tom","ABCDEFG");
        flowers[size++] = new Flower(1002,"白玫瑰",100,82.1,"2020-03-01","Tomson","DFDSFS");
        flowers[size++] = new Flower(1003,"黑玫瑰",50,83.1,"2020-03-09","Tomson","UCD");
        flowers[size++] = new Flower(1004,"牵牛花",20,84.2,"2020-03-01","Jim","DAND");
        flowers[size++] = new Flower(1005,"喇叭花",60,80.1,"2020-03-07","Sam","CAAC");
        flowers[size++] = new Flower(1006,"茉莉花",30,88.2,"2020-03-09","Samon","CBD");
    }

    /**
     * 查询所有的鲜花
     *
     * @return所有的鲜花
     */
    @Override
    public Flower[] listFlowers() {
        return flowers;
    }

    /**
     * 修改鲜花
     * 步骤：
     * 1 遍历鲜花数组，找到参数Flower鲜花id对应的数组下标
     * 2 将新的鲜花信息放入数组下标中
     * @param flower 鲜花实体信息
     */
    @Override
    public void updateFlower(Flower flower) {
        int length = flowers.length;
        // 要修改的鲜花对应的下标
        int index = -1;
        // 遍历鲜花数组，获取参数flower的id对应的鲜花下标
        for (int i = 0; i < length ; i++) {
            // 条件成立：表示鲜花为空，跳出本次循环
            if(null == flowers[i]){
                continue;
            }
            // 条件成立：参数的id等于鲜花数组的id，此时获取鲜花的下标
            if(flowers[i].getId() == flower.getId()){
                index = i;
                break;
            }
        }
        // 根据下标修改鲜花
        flowers[index] = flower;
    }

    /**
     * 删除鲜花(根据鲜花id去鲜花数组中删除对应的鲜花)
     * 步骤：1 找到鲜花id对应的数组下标
     *      2 根据下标删除鲜花
     *          2.1 计算要挪动的数组长度(数目)
     *          2.2 挪动数组
     *          2.3 删除数组末尾元素
     * @param id
     */
    @Override
    public void deleteFlowerById(int id) {
        int length = flowers.length;
        // 要删除的数组下标
        int index = -1;
        for (int i = 0; i < length; i++) {
            if(null == flowers[i]){
                continue;
            }
            // 条件成立：将数组下标赋值给index
            if(id == flowers[i].getId()){
                index = i;
                break;
            }
        }
        // 计算flowes数组需要挪动的长度
        int numMoved = size - index -1;
        // 条件成立：表示要删除的元素不是末尾元素，后面元素整体向前挪动numMoved个长度
        if(numMoved>0){
            System.arraycopy(flowers,index+1,flowers,index,numMoved);
        }
        // 删除末尾元素
        flowers[--size] = null;
        // flowers[6]=null ,然后将size-1
    }

    @Override
    public Flower getFlowerById(int id) {
        Flower ff = null;
        // 遍历flowers数组的所有元素
        for (Flower flower : flowers) {
            // 条件成立：鲜花为空，退出本次循环体，进入下次循环
            if(null == flower){
                continue;
            }
            // 条件成立：表示flower就是我要获取的鲜花信息
            if(id == flower.getId()){
                ff = flower;
                break;
            }
        }
        return ff;
    }
}
