//之字形打印二叉树
//在Solution2的基础上增加了一个布尔常量进行翻转控制
public class Solution3 {
    public ArrayList<ArrayList<Integer>> PrintFromTopToBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        //队列不为空
        boolean reverse=false;
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                result.add(temp.val);
                if(temp.left!=null)queue.offer(temp.left);
                if(temp.right!=null)queue.offer(temp.right);
            }
            if(reverse){
                Collections.reverse(list);
                reverse=false;
            }else{
                reverse=true;
            }
            result.add(list);
        }
        return result;
    }
}
