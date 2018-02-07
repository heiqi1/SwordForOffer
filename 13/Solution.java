public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        //参数检查
        if(threshold<0||rows<=0||cols<=0)return 0;
        //变量初始化
        boolean[]  visited=new boolean[rows*cols];
        for(int i=0;i<rows*cols;i++)visited[i]=false;
        int count=movingCount(threshold,rows,cols,visited,0,0);
        return count;
    }
    private int movingCount(int threshold, int rows, int cols,boolean[] visited,
                           int row,int col){
        int count=0;
        //越界检查
        if(check(threshold,rows,cols,visited,row,col)){
            visited[row*cols+col]=true;
            count=1+movingCount(threshold,rows,cols,visited,row,col-1)
                +movingCount(threshold,rows,cols,visited,row-1,col)
                +movingCount(threshold,rows,cols,visited,row,col+1)
                +movingCount(threshold,rows,cols,visited,row+1,col);
        }
        return count;
    }
    //检查是否越界
    private boolean check(int threshold, int rows, int cols,boolean[] visited,
                           int row,int col){
        if(row>=0&&row<rows&&col>=0&&col<cols&&
           getNumber(row)+getNumber(col)<=threshold&&!visited[row*cols+col])
            return true;
        return false;
    }
    //得到一个数字的数位之和
    private int getNumber(int number){
        int sum=0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
