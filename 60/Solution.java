/**
假设f(m,n)表示投第m个骰子时，点数之和n出现的次数,投第m个骰子时的点数之和只与投第m-1个骰子时有关。

递归方程：f(m,n)=f(m-1,n-1)+f(m-1,n-2)+f(m-1,n-3)+f(m-1,n-4)+f(m-1,n-5)+f(m-1,n-6)，
表示本轮点数和为n出现次数等于上一轮点数和为n-1，n-2，n-3，n-4，n-5，n-6出现的次数之和。

初始条件：第一轮的f(1),f(2),f(3),f(4),f(5),f(6)均等于1.


/*
public class Solution{
    private static int face=6;
    public double countProbability(int n, int s){//把 n 个骰子仍在地上，求点数和为 s 的概率。
        if(n<1||s<n)return 0.0;
        int pointSum=n*face;                     //n个骰子最大的点数
        int[][] dp=new int[n+1][pointSum+1];
        for(int i=1;i<face;i++){                 //第一轮情况
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++)                    //i个骰子
            for(int sum=i;sum<=pointSum;sum++){  //点数和
                for(int k=1;sum>k&&k<=face;k++){ //每个骰子可能出现的点数，即1~6
                    dp[i][sum]+=dp[i-1][sum-k];  //当前骰子出现的点数次数等于上一轮出现点数的次数之和
                }
            }
        }
        int total=Matk.pow(face,n);              //所有可能出现的次数
        return (double)dp[n][s]/total;           //和为s出现的概率
    }
}
```
