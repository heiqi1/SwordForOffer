
/**
 *题目三：普通树，没有指向父结点的指针
 * 输入一棵普通树的两个结点，返回它们的最低公共祖先。
 */
public class Solution3{
    private class TreeNode {
        List<TreeNode> children;
        int val;
    }
    public TreeNode findLastSame(TreeNode root, TreeNode a, TreeNode b){
        if (root == null || a == null || b == null) return null;
        LinkedList<TreeNode> path1=new LinkedList<>();
        LinkedList<TreeNode> path2=new LinkedList<>();
        collectionNode(root,a,path1);
        collectionNode(root,b,path2);
        return getLastSameNode(path1, path2);
    }
    
    /**
     * 收集含有结点node的路径上的所有结点，形成一条链表
     */
    private boolean collectionNode(TreeNode root,TreeNode node,LinkedList<TreeNode> path){
        if(root==node)return true;
        path.add(root);
        for(TreeNode child:root.children){
            if(collectionNode(child,node,path))return true;
        }
        // 该条路径上没找到结点node就要从路径中移除
        path.removeLast();
        return false;
    }
    **
     * 两个链表前面的结点都是相同的，找到最后一个相同的结点就是最低公共祖先
     */
    private TreeNode getLastSameNode(LinkedList<TreeNode> path1, LinkedList<TreeNode> path2){
        TreeNode lastSameNod=null;
        while(!path1.isEmpty()&&!path2.isEmpty()){
            if(path1.peekFirst==path2.peekFirst)
                lastSameNode = path1.removeFirst();
            else
                return lastSameNode;
        }
        return lastSameNode;
    }
}
