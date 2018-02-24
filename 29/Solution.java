//顺时针打印矩阵
public class Solution {
    ArrayList<Integer>  result=new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int start=0;
        while(row>2*start&&col>2*start){
            printMatrix(matrix,row,col,start);
            start++;
        }
        return result;
    }
    //在圆圈中打印矩阵
    private void printMatrix(int[][] matrix,int row,int col,int start){
        int endX=col-1-start;
        int endY=row-1-start;
        //从左到右打印一行
        for(int i=start;i<=endX;i++)
            result.add(matrix[start][i]);
        //从上到下打印一列
        if(start<endY){
            for(int i=start+1;i<=endY;i++)
                result.add(matrix[i][endX]);
        }
        //从右到左打印一行
        if(start<endX&&start<endY){
            for(int i=endX-1;i>=start;i--)
                result.add(matrix[endY][i]);
        }
        //从下到上打印一行
        if(start<endX&&start<endY-1){
            for(int i=endY-1;i>=start+1;i--)
                result.add(matrix[i][start]);
        }
    }
}
