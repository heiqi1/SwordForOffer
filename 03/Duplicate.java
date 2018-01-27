public class Duplicate{
    public boolean duplicate(int[] nums){
        if(nums==null||nums.length==0)return false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0||nums[i]>nums.length-1)
                return false;
        }
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return true;
                }else{
                    int temp=nums[i];
                    nums[i]=nums[temp];
                    nums[temp]=temp;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={2,3,1,0,2,5,3}; 
        Duplicate test=new Duplicate();
        System.out.println(test.duplicate(nums));  
    }
}
