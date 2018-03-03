/**礼物的最大价值
动态规划，到达dp(i,j)处拥有的礼物价值和有两种情况：
1、从左边来，即dp(i, j) = dp(i, j -1) + nums(i, j)
2、从上边来，即dp(i, j) = dp(i -1, j) + nums(i, j)
*/
public class Solution {
    public int getMaxVaule(int[][] nums) {
        if(nums==null||nums.length==0)return 0;
        int row=nums.length;
        int col=nums[0].length;
        int[][] dp=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int left=0;
                int up=0;
                if(i>0)up=dp[i-1][j];
                if(j>0)left=dp[i][j-1];
                dp[i][j]=Math.max(up,left)+nums[i][j];
            }
        }
        return dp[row-1][col-1];
    }
}
