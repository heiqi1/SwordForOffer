//数字序列中某一位的数字
public class Solution{
    public int digitAtIndex(int index){
        if(index<0)return -1;
        if(index<10)return index;
        int cur=10;//当前数字
        int length=2;//数字属于几位数
        int boundNum=10;//位数相乘
        while(cur+lengthSum(length)<index){
            cur+=lengthSum(length);
            boundNum*=10;
            length++;
        }
        int addNum=(index-cur)/length;
        int curNum=boundNum+addNum;//属于哪个数字
        return Integer.toString(curNum).charAt(index-cur-addNum*length)-'0';//属于这个数字的哪个字
    }
    //位数的最小值，比如两位数就是第190
    public int lengthSum(int length){
        int count=9;
        for(int i=1;i<length;i++){
            count*=10;
        }
        return count*length;
    }
}
