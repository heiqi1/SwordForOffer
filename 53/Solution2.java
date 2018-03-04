//题目二：0~n-1中缺失的数字
public class Solution2{
    public int getMissingNumber(int[] nums){
        if(nums==null||nums.length==0)return 0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid==nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
