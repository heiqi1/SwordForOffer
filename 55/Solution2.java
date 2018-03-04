//题目二：平衡二叉树
public class Solution2 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return isBlance(root,new int[1]);
    }
    public boolean isBlance(TreeNode root,int[] depth){
        if(root==null){
            depth[0]=0;
            return true;
        }
        boolean left=isBlance(root.left,depth);
        //左子树深度
        int leftDepth=depth[0];
        boolean right=isBlance(root.right,depth);
        //右子树深度
        int rightDepth=depth[0];
        //当前节点的深度
        depth[0]=Math.max(leftDepth+1,rightDepth+1);
        if(left&&right&&Math.abs(leftDepth-rightDepth)<=1)return true;
        else return false;
    }
}
