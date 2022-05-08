class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}

public class BinaryTree {

    public TreeNode createBinaryTree(){
        TreeNode A=new TreeNode(3);
        TreeNode B=new TreeNode(9);
        TreeNode C=new TreeNode(20);
        TreeNode F=new TreeNode(15);
        TreeNode G=new TreeNode(7);

        A.left=B;
        A.right=C;
        C.left=F;
        C.right=G;

        return A;
    }


}
