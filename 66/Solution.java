//构建乘积数组
public class Solution {
    public int[] multiply(int[] A) {
        if(A==null||A.length<2)return null;
        int[] result=new int[A.length];
        result[0]=1;
        for(int i=1;i<A.length;i++){
            result[i]=result[i-1]*A[i-1];
        }
        int temp=1;
        for(int i=A.length-2;i>=0;i--){
            temp*=A[i+1];
            result[i]=temp*result[i];
        }
        return result;
    }
}
