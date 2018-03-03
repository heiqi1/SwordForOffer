/**
约瑟夫问题
递推公式
让f[i]为i个人玩游戏报m退出最后的胜利者的编号，最后的结果自然是f[n]
服了
f[1] = 0;
f[i] = (f[i - 1] + m) mod i;
*/
public class Solution2 {
    public int LastRemaining_Solution(int n, int m) {
    if(n<1 || m<1) return -1;
    int last=0;
    for(int i=2; i<=n; ++i) {
       last=(last+m)%i;
    }
    return last;
    }
}
