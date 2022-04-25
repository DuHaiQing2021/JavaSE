package com.company;

import java.util.LinkedList;
import java.util.Queue;

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
    //求整棵树的高度2
    public int getHeight2(BTNode root){
        if (root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left)+1;
        int rightHeight=getHeight(root.right)+1;
        return Math.max(leftHeight,rightHeight);

    }

    //找元素值
    public BTNode find(BTNode root,char val){
        if (root==null){
            return null;
        }
        if (root.val==val){
            return root;
        }
        BTNode ret=find(root.left,val);
        if (ret!=null){
            return ret;
        }
        ret=find(root.right,val);
        if (ret!=null){
            return ret;
        }
        return null;
    }
    //找元素值2
    public BTNode find2(BTNode root,char val){
        if (root==null){
            return null;
        }
        if (root.val==val){
            return root;
        }
        if (find(root.left,val)!=null){
            return find(root.left,val);
        }
        if (find(root.right,val)!=null){
            return find(root.right,val);
        }
        return null;
    }
    /**
     * 是不是完全二叉树
     *
     */
    public boolean isCompleteTree(BTNode root){
        if (root==null) return true;
        Queue<BTNode> queue=new LinkedList<>();
        queue.add(root);

        //将弹出去的左右结点放进队列，遇到null停止
        while(queue.peek()!=null){
            BTNode ret=queue.poll();
            if (ret!=null){
                queue.add(ret.left);
                queue.add(ret.right);
            }
        }

        //进行判断队列中元素是否都为空
        while (!queue.isEmpty()){
            if (queue.peek()!=null){
                return false;
            }
            queue.poll();
        }
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null&&q!=null){
            if(p.val==q.val){
                return true;
            }else{
                return false;
            }
        }else if(p==null && q==null){
            return ture;
        }else{
            return false;
        }

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
