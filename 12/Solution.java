/**
    * @param matrix 输入矩阵
    * @param rows   矩阵行数
    * @param cols   矩阵列数
    * @param str    要搜索的字符串
    * @return 是否找到 true是。false否
    */
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        //参数检验
        if(matrix==null||matrix.length!=rows*cols||str==null||str.length<1)
            return  false;
        //变量初始化
        boolean[] visited=new boolean[rows*cols];
        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }
        //记录结果数组的长度
        int pathLength=0;
        //以每个点为起始进行搜索
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(hasPath(matrix,rows,cols,str,visited,i,j,pathLength))
                    return true;
            }
        }
        return false;
    }
    /**
     * 回溯搜索算法
     *
     * @param matrix     输入矩阵
     * @param rows       矩阵行数
     * @param cols       矩阵列数
     * @param str        要搜索的字符串
     * @param visited    訪问标记数组
     * @param row        当前处理的行号
     * @param col        当前处理的列号
     * @param pathLength 已经处理的str中字符个数
     * @return 是否找到 true是，false否
     */
    public boolean hasPath(char[] matrix,int rows,int cols,char[] str,boolean[] visited,
                                  int row,int col,int pathLength){
        if(pathLength==str.length)return true;
        boolean isPath=false;
        //位置是否合法
        if(row>=0&&row<rows&&col>=0&&col<cols&&matrix[row*cols+col]==str[pathLength]&&
          !visited[row*cols+col]){
            visited[row*cols+col]=true;
            pathLength++;
            isPath=hasPath(matrix,rows,cols,str,visited,row,col-1,pathLength)||
                   hasPath(matrix,rows,cols,str,visited,row-1,col,pathLength)||
                   hasPath(matrix,rows,cols,str,visited,row,col+1,pathLength)||
                   hasPath(matrix,rows,cols,str,visited,row+1,col,pathLength);
            if(!isPath){
                pathLength--;
                visited[row*cols+col]=false;
            }
        }
        return isPath;
    }
}
