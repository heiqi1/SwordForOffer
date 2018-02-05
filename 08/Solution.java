
/**
 * 思路：此题包含三步：
 * 1. 如果此节点有右子树，下一个节点为右子节点的最左边的节点。
 * 2.如果此节点没有右子树，并且如果此节点是其父节点的左子节点，则下一个节点为父节点。
 * 3.如果此节点没有右子树，并且如果此节点是其父节点的右子节点，则一直向上找，直到找到第一个是其父节点左节点的节点，下一个节点就为此节点。
 */
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)return null;
        TreeLinkNode result=null;
        //右子树不为空
        if(pNode.right!=null){
            TreeLinkNode temp=pNode.right;
            while(temp.left!=null){
                temp=temp.left;
            }
            result=temp;
        //右子树为空
        }else{
            TreeLinkNode parent=pNode.next;
            TreeLinkNode cur=pNode;
            //此节点是父节点的右子节点
            while(parent!=null&&pNode==parent.right){
                pNode=parent;
                parent=parent.next;
            }
            result=parent;
        }
        return result;
    }
}
