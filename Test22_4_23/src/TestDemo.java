/**
 * 二叉树
 * 1.树的概念
 * 树是一种非线性的数据结构，它是由n（n>=0）个有限节点组成一个具有层次关系的集合
 * 把它叫做树是因为它看起来像一颗倒挂的树，也就是说它是根朝上，而叶子朝下。
 * 它具有以下的特点：
 *    （1）有一个特殊的节点，称为根节点，根节点没有前驱节点
 *    （2） 除根结点外，其余节点被分成M（m>0）个互不相交的集合T1、T2.。。、Tm，其中每一个集合Ti（1<=i<=m)
 *    又是一棵与树类似的子树，每棵子树的根节点有且只有一个前驱，可以有0个或者多个后续
 *    （3）树是递归定义的。
 *
 *
 *
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BTNode root=binaryTree.createTree();
        binaryTree.preOrder(root);
    }


}
