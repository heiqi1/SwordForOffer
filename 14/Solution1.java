/**
 *思路：首先定义函数f(n)为把长度为n的绳子剪成若干段后各段长度乘积的最大值。在剪第一刀时，我们有n-1种选择，也*就是说第一段绳子的可能长度分别为1,2,3.....，n-1。因此f(n)=max(f(i)*f(n-i))，其中0<i<n。
 *
 */
public class Solution1{
    public static int maxProductAterCutting(int length){
        if(length<2)return 0;
        if(length==2)return 1;
        if(length==3)return 2;
        int[] dp=new int[length+1];
        // 数组中第i个元素表示把长度为i的绳子剪成若干段之后的乘积的最大值
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        int max=0;
        for(int i=4;i<=length;i++){
            max=0;
            // 求出所有可能的f(j)*f(i-j)并比较出他们的最大值
            for(int j=1;j<=i/2;j++){
                dp[i]=Math.max(max,dp[j]*dp[i-j]);
            }
        }
        return dp[length];
    }
    public static void main(String[] args) {
        System.out.println(maxProductAterCutting(8));
    }
}
