//不分行从上到下打印二叉树
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        //队列不为空
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            result.add(temp.val);
            if(temp.left!=null)queue.offer(temp.left);
            if(temp.right!=null)queue.offer(temp.right);
        }
        return result;
    }
}
