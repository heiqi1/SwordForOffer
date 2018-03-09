/**
1、排序 
2、计算所有相邻数字间隔总数 
3、计算0的个数 
4、如果2、3相等，就是顺子 
5、如果出现对子，则不是顺子
*/
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length==0)return false;
        int numberZero=0;
        int numberInterval=0;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==0){
                numberZero++;
                continue;
            }
            if(numbers[i]==numbers[i+1])
                return false;
            numberInterval+=numbers[i+1]-numbers[i]-1;
        }
        if(numberZero-numberInterval>=0)return true;
        return false;
    }
}
