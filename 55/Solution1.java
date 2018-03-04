//题目一：二叉树的深度
public class Solution1 {
    public int TreeDepth(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode>  queue=new LinkedList<>();
        queue.add(root);
        int depth=0;//当前节点所在的层数
        int count=0;//已经遍历了的节点数
        int nextCount=1;//下层的节点总数
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            count++;
            if(cur.left!=null)queue.add(cur.left);
            if(cur.right!=null)queue.add(cur.right);
            //代表本层的节点已经遍历完毕
            if(count==nextCount){
                nextCount=queue.size();
                count=0;
                depth++;
            }
        }
        return depth;
    }
}
