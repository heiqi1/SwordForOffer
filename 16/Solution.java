//递归：n为偶数，a^n=a^n/2*a^n/2;n为奇数，a^n=（a^（n-1）/2）*（a^（n-1/2））*a
时间复杂度O（logn）
public class Solution {
    public double Power(double base, int exponent) {
        int temp=Math.abs(exponent);
        if(temp==0)return 1;
        if(temp==1)return base;
        double result=Power(base,temp>>1);
        result*=result;
        if((temp&1)==1)result*=base;
        if(exponent<0)result=1/result;
        return result;
  }
}
