/** 把数字翻译成字符串
自下而上，动态规划，从最小的问题开始 ：
f(r)表示以r为开始（r最小取0）到最右端所组成的数字能够翻译成字符串的种数。对于长度为n的数字，f(n)=0,f(n-1)=1,求f(0)。
递推公式为 f(r-2) = f(r-1)+g(r-2,r-1)*f(r)；
其中，如果r-2，r-1能够翻译成字符，则g(r-2,r-1)=1，否则为0。
因此，对于12258：
f(5) = 0
f(4) = 1
f(3) = f(4)+0 = 1
f(2) = f(3)+f(4) = 2
f(1) = f(2)+f(3) = 3 
f(0) = f(1)+f(2) = 5
*/
public class Solution {
    public String TranslateNumbersToStrings(int number) {
        if(number<0)return 0;
        if(number==1)return 1;
        return getTranslationCount(Integer.toString(number));
    }
    //动态规划，从右到左计算。
    //f(r-2) = f(r-1)+g(r-2,r-1)*f(r);
    //如果r-2，r-1能够翻译成字符，则g(r-2,r-1)=1，否则为0
    public int getTranslationCount(String number){
        int dp_1=0;//f(r-1)
        int dp_2=1;//f(r-2)
        int g=0;
        for(int i=number.length()-2;i>=0;i--){
            if(Integer.parseInt(number.charAt(i))+""+Integer.parseInt(number.charAt(i+1))<26)
                g=1;
            else
                g=0;
            int temp=dp_2;
            dp_2=dp_2+dp_1*g;
            dp_1=temp;
        }
        return dp_2;
    }
}
