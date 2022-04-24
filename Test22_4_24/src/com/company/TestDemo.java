package com.company;


public class TestDemo {
    public static void main(String[] args) {
        BinrayTree binrayTree=new BinrayTree();
        BTNode root=binrayTree.createTree();//

        System.out.println("============前序遍历============");
        binrayTree.preOrder(root);
        System.out.println();
        System.out.println("============中序遍历============");
        binrayTree.inOrder(root);
        System.out.println();
        System.out.println("============后序遍历============");
        binrayTree.postOrder(root);
        System.out.println();
        System.out.println("============元素的个数遍历思路========");
        int a=binrayTree.size(root);
        System.out.println(a);
        System.out.println("============元素的个数子问题思路=======");
        int b=binrayTree.size1(root);
        System.out.println(b);

        System.out.println("============叶子结点的个数 遍历思路======");
        int c=binrayTree.getLeafNodeCount(root);
        System.out.println(c);
        System.out.println("============叶子结点的个数 子问题思路======");
        int d=binrayTree.getLeafNodeCount1(root);
        System.out.println(d);
        System.out.println("============第K层结点的个数==============");
        int e=binrayTree.getKLevelNodeCount(root,3);
        System.out.println(e);
        System.out.println("============求树的高度===================");
        int f=binrayTree.getHeight(root);
        System.out.println(f);
    }

}
