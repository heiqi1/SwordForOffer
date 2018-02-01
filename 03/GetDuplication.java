public class GetDuplication {
    /**
     * 不修改数组的情况下找出重复的数字
     * 数组长度n+1,数字的范围在1~n
     * 要求返回重复的数字
     */
    public static int getDuplication(int[] nums){
        //检查是否符合要求
        if(nums==null||nums.length==0)return -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<1||nums[i]>=nums.length)
                return -1;
        }
        //二分法查找重复数字
        int start=1;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int count=getCount(nums,start,mid);
            if(start==end){
                if(count>1)
                    return start;
                else
                    break;
            }
            if(count>(mid-start+1))
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    public static int getCount(int[] nums,int start,int mid){
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>=start&&nums[i]<=mid)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums={2,3,5,4,3,2,6,7};
        GetDuplication test=new GetDuplication();
        System.out.println(test.getDuplication(nums));
    }
}
