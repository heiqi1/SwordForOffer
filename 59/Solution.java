//滑动窗口的最大值
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> result=new ArrayList<>();
        if(num==null||num.length==0||size>num.length||size<=0)return result;
        int max=0;
        for(int i=0;i<=(num.length-size);i++){
            max=num[i];
            for(int j=i;j<(i+size);j++){
                if(max<num[j])max=num[j];
            }
            result.add(max);
        }
        return result;
    }
}
