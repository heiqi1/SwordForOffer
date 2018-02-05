public class Solution1 {
    public int Fibonacci(int n) {
        if(n==0)return 0;
        if(n<3)return 1;
        //n的前一个数
        int n_1=1;
        //n的前第二个数
        int n_2=1;
        int result=0;
        for(int i=3;i<=n;i++){
            result=n_1+n_2;
            n_2=n_1;
            n_1=result;
        }
        return result;
    }
}
