package com.company;

class BTNode{
    public char val;
    public BTNode left;
    public BTNode right;

    public BTNode(char val){
        this.val=val;
    }
}

public class BinrayTree {

    public BTNode createTree(){
        BTNode A=new BTNode('A');
        BTNode B=new BTNode('B');
        BTNode C=new BTNode('C');
        BTNode D=new BTNode('D');
        BTNode E=new BTNode('E');
        BTNode F=new BTNode('F');
        BTNode G=new BTNode('G');
        BTNode H=new BTNode('H');

        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.right=H;

        return A;//树根结点

    }

    //前序遍历
    public void preOrder(BTNode root){
        if (root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    //中序遍历
    public void inOrder(BTNode root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    //后序遍历
    public void postOrder(BTNode root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");

    }

    //求元素个数,递归遍历思路
    public int count=0;
    public int size(BTNode root){
        if (root== null){
            return 0;
        }
        count++;
        size(root.left);
        size(root.right);
        return count;
    }

    //求元素个数2 子问题思路
    /**
     * return size1(root.left) + size1(root.right) + 1;
     * 这个代码root先不断的left左移，在这个过程中root不断产生分机+1，遇到null返回0，root.right又开始不断右移+1
     * 遇到null返回0
     */
    public int size1(BTNode root){
        if (root==null){
            return 0;
        }
        return size1(root.left) + size1(root.right) + 1;

    }


    //求叶子结点个数 遍历思路
    public int len=0;
    public int getLeafNodeCount(BTNode root){
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            len++;
        }
        getLeafNodeCount(root.left);
        getLeafNodeCount(root.right);
        return len;

    }

    //求叶子结点个数 子问题思路
    public int getLeafNodeCount1(BTNode root){
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNodeCount1(root.left)+getLeafNodeCount1(root.right);
    }


    //求第K层结点的个数
    public int getKLevelNodeCount(BTNode root,int k){
        if (root==null||k<=0){
            return 0;
        }
        if (k==1){
            return 1;
        }
        return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
    }

    //求整棵树的高度
    public int getHeight(BTNode root){
        if (root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight+1:rightHeight+1;

    }
}
