public class Solution {
    private TreeNode result=null,head=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)return pRootOfTree;
        inOrder(pRootOfTree);
        return result;
    }
    private void inOrder(TreeNode node){
        if(node==null)return;
        inOrder(node.left);
        if(result==null){
            result=node;
            head=node;
        }else{
            head.right=node;
            node.left=head;
            head=node;
        }
        inOrder(node.right);
    }
}
