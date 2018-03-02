//把数组排列成最小的数
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null||numbers.length==0)return "";
        String str="";
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a=Integer.valueOf(numbers[i]+""+numbers[j]);
                int b=Integer.valueOf(numbers[j]+""+numbers[i]);
                if(a>b)swap(numbers,i,j);
            }
        }
        for(int i=0;i<numbers.length;i++){
            str+=String.valueOf(numbers[i]);
        }
        return str;
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
