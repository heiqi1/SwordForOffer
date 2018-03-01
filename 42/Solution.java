//连续子数组的最大和
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null|array.length==0)return 0;
        int[]  dp=new int[array.length];
        dp[0]=array[0];
        int max=dp[0];
        for(int i=1;i<array.length;i++){
            dp[i]=Math.max(array[i],dp[i-1]+array[i]);
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
