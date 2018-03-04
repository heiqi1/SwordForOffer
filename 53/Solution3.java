//题目三：数组中数值和下标相等的元素
public class Solution3{
    public int getMissingNumber(int[] nums){
        if(nums==null||nums.length==0)return 0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid==nums[mid]){
                return mid;
            }else if(nums[mid]>mid){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
