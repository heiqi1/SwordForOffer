public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0)return 0;
        int count=0;
        int elem=0;
        for(int i=0;i<array.length;i++){
            if(count==0){
                elem=array[i];
                count=1;
            }else{
                if(elem==array[i]){
                    count++;
                }else {
                    count--;
                }
            }
        }
        count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==elem){
                count++;
            }
        }
        if(count*2>array.length)return elem;
        return 0;
    }
}
