/**
题目一：数组中只出现一次的两个数字

思路：
1. 异或思想，一个数与自己异或为0，一个数与0异或为自己
1. 由于其它数字两两相同，所以所有数异或则得到这两个不同数的异或结果。取这个结果的第一个1作为标志位
1. 这个标志的1，必须是：这两个数在该位一个为0，一个为1
1. 这样可以将数组分为两组，一组在该标志位为1，一组在该标志位为0，这两个不同数字分别在这两组内
1. 将两组内的数分别异或，得到两个结果则为这两个不同的数
*/
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution1 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null||array.length<2){
            num1[0]=0;
            num2[0]=0;
            return;
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum^=array[i];//所有数异或，结果为不同的两个数字的异或
        }
        int count=0;//标志位，记录num中的第一个1出现的位置
        for(;count<array.length;count++){
            if((sum&(1<<count))!=0)
                break;
        }
        num1[0]=0;
        num2[0]=0;
        for(int i=0;i<array.length;i++){
            //标志位为0的为一组，异或后必得到一个数字（这里注意==的优先级高于&，需在前面加（））
            if((array[i]&(1<<count))==0){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];//标志位为1的为一组
            }
        }
    }
}
