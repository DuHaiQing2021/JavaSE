
class BTNode{
    public char val;
    public BTNode left;
    public BTNode right;
    public BTNode(char val){
        this.val=val;
    }
}
public class BinaryTree {


    public BTNode createTree(){
        BTNode A=new BTNode('a');
        BTNode B=new BTNode('b');
        BTNode C=new BTNode('c');
        BTNode D=new BTNode('d');
        BTNode E=new BTNode('e');
        BTNode F=new BTNode('f');
        BTNode G=new BTNode('g');
        BTNode H=new BTNode('h');

        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.right=H;

        return A;
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
}
