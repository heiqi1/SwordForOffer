/**
 *思路：旋转之后的数组实际上可以划分成两个有序的子数组：前面子数组的大小都大于后面子数组中的元素
 *1、array[mid] > array[left]：说明旋转后最小值在左区间
 *2、array[mid] < array[left]：说明旋转后最小值在右区间
 *3、若是有重复元素的情况，即mid、left、right三个位置上元素都相等的情况，导致无法判断最小值出现在哪一边，解决方法就是跳过left、right这个位置
 *4、若数组是顺序无旋转的，则最小值是array[0]
 */


public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0)return 0;
        int left=0;
        int right=array.length-1;
        while(left<right){
            int mid=(right+left)>>1;
            //出现重复元素
            if(array[mid]==array[left]&&array[mid]==array[right]){
                left++;
                right--;
            }
            //出现旋转数组时,mid>mid+1，所以最小值在右边
            if(array[mid]>array[mid+1]){
                return array[mid+1];
            }else if(array[left]<array[mid]){
                left=mid;
            }else{
                right=mid;
            }
        }
        return array[0];
    }
}
