//题目一：如果这颗树是二叉查找树
public class Solution1{
    private class TreeNode {
        private TreeNode left, right;
        private int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode findLastSame(TreeNode root, TreeNode a, TreeNode b){
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val<a.val&&cur.val<b.val){
                cur=cur.left;
            }else if(cur.val>a.val&&cur.val>b.val){
                cur=cur.right;
            }else{
                return cur;
            }
        }
        return null;
    }
}
