//题目二：数组中唯一只出现一次的数字
public class Solution2 {
    public int FindNumsAppearOnce(int [] array]){
        int result=0;//需要返回的结果
        int sum;//累加和
        for(int i=0;i<32;i++){
            sum=0;//每一轮都需要归零
            for(int j=0;j<array.length;j++){
                sum+=((array[j]>>i)&1);//每轮只对固定某一位做累加
            }
            if(sum%3==1){
                result=result|(1<<i);
            }
        }
        return result;
    }
}
