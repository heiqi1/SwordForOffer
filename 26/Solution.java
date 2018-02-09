public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1==null||root2==null)
            return false;
        return IsSubTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    public boolean IsSubTree(TreeNode root1,TreeNode root2){
        if (root2==null)
            return true;
        if (root1==null)
            return false;
        if (root1.val==root2.val)
            return IsSubTree(root1.left,root2.left)&&IsSubTree(root1.right,root2.right);
        else
            return false;
    }
}
