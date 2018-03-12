//题目二：拥有指向父结点的指针
public class Solution2{
    private class TreeNode {
        TreeNode parent;
        int val;

        public TreeNode() {
            this.val = val;
        }
    }
    /**
     * 变成了两条链表的第一个公共结点问题
     */
    public TreeNode findLastSame(TreeNode a, TreeNode b){
        TreeNode cur1=a;
        TreeNode cur2=a;
        int len1=0;
        int len2=0;
        while(cur1!=null){
            len1++;
            cur1=cur1.parent;
        }
        while(cur2!=null){
            len2++;
            cur2=cur2.parent;
        }
        if(len1>len2){
            for(int i=0;i<len1-len2;i++)a=a.parent;
        }
        if(len2>len1){
            for(int i=0;i<len2-len1;i++)b=b.parent;
        }
        while(a!=null&&b!=null){
            if(a==b)return a;
            a=a.parent;
            b=b.parent;
        }
        return null;
    }
}
