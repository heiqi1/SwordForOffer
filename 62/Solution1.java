public class Solution1 {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0)return -1;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(i);
        }
        int temp=(m-1)%result.size();//用于记录最初需清除的数字索引
        while(result.size()!=1){
            result.remove(temp);
            temp=(temp+(m-1))%result.size();//记录当前索引，在当前的基础上再往前数（m-1）对删除了前一个节点的链表大小求余得到下一个要删除的节点的位置。
        }
        return result.get(0);
    }
}
