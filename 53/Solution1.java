//题目一：数字在排序数组中出现的次数
public class Solution1 {
    public int GetNumberOfK(int [] array , int k) {
       if(array==null||array.length==0)return 0;
        int index=-1;
        int start=0;
        int end=array.length-1;
        //二分法
        while(start<=end){
            int mid=(start+end)>>1;
            if(array[mid]==k){
                index=mid;
                break;
            }else if(array[mid]>k)
                end=mid-1;
            else
                start=mid+1;
        }
        //index=-1表明不存在k
        if(index==-1)return 0;
        start=index-1;
        end=index+1;
        //向前遍历
        while(start>=0&&array[start]==k)
            --start;
        //向后遍历
        while(end<array.length&&array[end]==k)
            ++end;
        return end-start-1;
    }
}
