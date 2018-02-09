public class Solution {
    public void reOrderArray(int [] array) {
        if(array==null||array.length==0)return;
        int[] temp=new int[array.length];
        int evencount=0,oddcount=0,j=0;
        for(int i=0;i<array.length;i++){
            //偶数都加入到这个数组中，并且偶数指数自增
            if(array[i]%2==0){
                temp[j++]=array[i];
                evencount++;
            }
            //为奇数时，
            if(array[i]%2!=0){
                array[i-evencount]=array[i];
                oddcount++;
            }
        }
        //数组的前部分都为奇数
        int count=oddcount;
        //将偶数加入到奇数后面
        for(int k=0;k<evencount;k++){
            array[count]=temp[k];
            count++;
        }
    }
}
