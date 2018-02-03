public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array==null)return true;
        if(array.length==0||array[0].length==0)return false;
        int row=array.length;
        int col=array[0].length;
        int left=row-1;
        int right=0;
        //从左下角开始查询
        while(left>=0&&right<col){
            if(array[left][right]==target)
                return true;
            else if(array[left][right]<target)
                right++;
            else
                left--;
        }
        return false;
    }
}
