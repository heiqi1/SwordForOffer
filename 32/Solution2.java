//分行从上到下打印二叉树
public class Solution2 {
    public ArrayList<ArrayList<Integer>> PrintFromTopToBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        //队列不为空
        while(!queue.isEmpty()){
            int size=queue.size();//每行二叉树的长度
            ArrayList<Integer> list=new ArrayList<>();//临时list
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                result.add(temp.val);
                if(temp.left!=null)queue.offer(temp.left);
                if(temp.right!=null)queue.offer(temp.right);
            }
            result.add(list);
        }
        return result;
    }
}
