package com.company;


import java.util.List;

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
//        int e=binrayTree.getKLevelNodeCount(root,3);
//        System.out.println(e);
        System.out.println("============求树的高度===================");
        int f=binrayTree.getHeight(root);
        System.out.println(f);

        try{
            BTNode ret=binrayTree.find(root,'C');
            System.out.println(ret.val);
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("这个结点不存在");
        }

        System.out.println("========判断是否是完全二叉树=============");
        boolean flg=binrayTree.isCompleteTree(root);
        System.out.println(flg);

        System.out.println("========判断是否是相同的树===============");
        BTNode root2=binrayTree.createTree2();
//        boolean ret=binrayTree.isSameTree(root,root2);
//        System.out.println(ret);

        System.out.println("========判断是否是子树===============");
        boolean flg2=binrayTree.isSubtree(root,root2);
        System.out.println(flg2);
        System.out.println("========判断是平衡二叉树===============");
        boolean flg3=binrayTree.isBalanced(root2);
        int flg3_int=binrayTree.isBalancedTreeHeight(root2);
        System.out.println(flg3);
        System.out.println(flg3_int);
        System.out.println();

        System.out.println("========判断是对称二叉树===============");
        boolean flg4=binrayTree.isSymmetric(root);
        boolean flg5=binrayTree.isSymmetric(root2);
        System.out.println(flg4);
        System.out.println(flg5);

        binrayTree.levelOrder(root);
        System.out.println();
        List<List<Character>> list =binrayTree.levelOrder2(root);
        System.out.println(list);
    }

}
