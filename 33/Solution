/**
思路：
已知条件：后序序列最后一个值为root；二叉搜索树左子树值都比root小，右子树值都比root大。
1. 确定root；
2. 遍历序列（除去root结点），找到第一个大于root的位置，则该位置左边为左子树，右边为右子树；
3. 遍历右子树，若发现有小于root的值，则直接返回false；
4. 分别判断左子树和右子树是否仍是二叉搜索树（即递归步骤1、2、3）。
*/
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0)return false;
        return VerifySquenceOfBST(sequence,0,sequence.length-1);
    }
    private boolean VerifySquenceOfBST(int[] sequence,int start,int end){
        if(start>=end)return true;
        int root=sequence[end];
        int i=start;
        //二叉搜索树的左子树都比根节点小
        while(sequence[i]<root){
            i++;
        }
        //二叉搜索树的右子树都比根节点大
        for(int j=i;j<end;j++){
            if(sequence[j]<root)
                return false;
        }
        return VerifySquenceOfBST(sequence,start,i-1)&&VerifySquenceOfBST(sequence,i,end-1);
    }
}
