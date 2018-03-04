//题目一：和为s的数字
public class Solution1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(array==null||array.length==0)return result;
        int left=0;
        int right=array.length-1;
        while(left<right){
            if(array[left]+array[right]==sum){
                result.add(array[left]);
                result.add(array[right]);
                return result;
            }else if(array[left]+array[right]<sum){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
