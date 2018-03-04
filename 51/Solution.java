//数组中的逆序对
public class Solution {
    int count=0;
    public int InversePairs(int [] array) {
        if(array==null||array.length==0)return 0;
        mergeCore(array,0,array.length-1);
        return count;
    }
    private void mergeCore(int[] array,int start,int end){
        int mid=start+(end-start)/2;
        if(start<end){
            mergeCore(array,start,mid);
            mergeCore(array,mid+1,end);
            mergeCoreSort(array,start,mid,end);
        }
    }
    private void mergeCoreSort(int[] array,int start,int mid,int end){
        int[] temp = new int[end-start+1];
        int right=mid+1;
        int arrayIndex=start,tempIndex=0;
        while (start<=mid&&right<=end){
            if(array[start]<=array[right]){
                temp[tempIndex++]=array[start++];
            }else{
                temp[tempIndex++]=array[right++];
                count+=mid-start+1;
                count %= 1000000007;
            }
        }
        while (start<=mid){
            temp[tempIndex++]=array[start++];
        }
        while(right<=end){
            temp[tempIndex++]=array[right++];
        }
        for(int index:temp){
            array[arrayIndex++]=index;
        }
    }
}
