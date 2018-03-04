//题目二：和为s的连续正数序列
public class Solution2 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > result=new ArrayList<ArrayList<Integer> >();
        if(sum<=0)return result;
        int left=1;
        int right=2;
        int cur=3;
        while(left<(sum+1)/2){
            while(cur<sum){
                right++;
                cur+=right;
            }
            if(cur==sum){
                ArrayList<Integer> temp=new ArrayList<>();
                for(int i=left;i<=right;i++)
                    temp.add(i);
                result.add(temp);
            }
            cur-=left;
            left++;
        }
        return result;
    }
}
