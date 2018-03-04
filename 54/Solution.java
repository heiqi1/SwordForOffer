//二叉搜索树的第k大节点
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null)return null;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=pRoot;
        int count=0;
        while(node!=null||!stack.empty()){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                count++;
                node=stack.pop();
                if(count==k)
                    return node;
                node=node.right;
            }
        }
        return null;
    }
}
