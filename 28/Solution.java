/*
 *思路：首先根节点以及其左右子树，左子树的左子树和右子树的右子树相同
 *      左子树的右子树和右子树的左子树相同即可，采用递归
 */
public class Solution {
     boolean isSymmetrical(TreeNode root)
    {
        if (root==null)return false;
        return isSame(root.left,root.left);
    }
    boolean isSame(TreeNode p1,TreeNode p2){
        if (p1==null&&p2==null) return true;
        if (p1==null||p2==null) return false;
        if (p1.val==p2.val)
            return isSame(p1.left,p2.right)&&isSame(p1.right,p2.left);
        else
            return false;
    }
}
