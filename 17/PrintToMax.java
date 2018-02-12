public class PrintToMax{
    public void printToMax(int n){
        if(n<=0)return;
        char[] number=new char[n];
        Arrays.fill(number,'0');//填充为0
        printOder(number,n,0);
    }
    //将0~9的数字进行全排列，长度就为n
    public void printOrder(char[] number,int n,int index){
        if(index==n)return;
        for(int i=0;i<=9;i++){
            number[index]=(char)('0'+i);
            //索引在字符数组中为n-1时，就进行打印
            if(index==n-1){
                printNumber(number);
            }
            //进行递归
            printOrder(number,n,index+1);
        }
    }
    //打印函数
    public void printNumber(char[] nums){
        int size=nums.length;
        int index=0;
        while(index<size&&nums[index]=='0'){ //i<size在前，防止越界
            index++;
        }
        if(index==size)return;//不打印全0
        char[] printNum=Arrays.copyOfRange(nums, i, size);//复制数组，若是字符数组的前部分为0，则忽略，从后面进行打印  
        System.out.println(printNum);
    }
}
