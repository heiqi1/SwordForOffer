
//二叉树中和为某一值的路径
public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        if(root==null)return result;
        FindPath(root,target,temp,result);
        return result;
    }
    public void FindPath(TreeNode root,int target,ArrayList<Integer> temp,
                                                 ArrayList<ArrayList<Integer>> result){
        if(root==null)return;
        temp.add(root.val);
        target-=root.val;
        if(root.left==null&&root.right==null){
            if(target==0){
                result.add(new ArrayList<Integer>(temp));
            }
        }
        FindPath(root.left,target,temp,result);
        FindPath(root.right,target,temp,result);
        temp.remove(temp.size()-1);
    }
}
