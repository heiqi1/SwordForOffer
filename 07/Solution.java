public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode result=construct(pre,0,pre.length-1,in,0,in.length-1);
        return result;
    }
    public TreeNode construct(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd)return null;
        TreeNode result=new TreeNode(pre[preStart]);
        for(int i=0;i<in.length;i++){
        //找到根节点
            if(in[i]==pre[preStart]){
                //构建左子树，(i-inStart)是左子树数组的长度
                result.left=construct(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
                //构建右子树
                result.right=construct(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
            }
        }
        return result;
    }
}
