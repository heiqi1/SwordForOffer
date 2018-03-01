//数据流中的中位数
public class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    int count=0;
    public void Insert(Integer num) {
        list.add(num);
        count++;
    }
    public Double GetMedian() {
        int[] nums=new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        Arrays.sort(nums);
        Double result=0.0;
        if(count%2==0){
            result=(nums[nums.length/2]+nums[nums.length/2-1])/2.0;
        }else{
            result=nums[nums.length/2]/1.0;
        }
        return result;
    }
}
