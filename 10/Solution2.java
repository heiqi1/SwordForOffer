public class Solution2 {
    public int JumpFloor(int target) {
        if(target==0)return 0;
        if(target==1)return 1;
        if(target==2)return 2;
        //n的前一个数
        int n_1=2;
        //n的前第二个数
        int n_2=1;
        int result=0;
        for(int i=3;i<=target;i++){
            result=n_1+n_2;
            n_2=n_1;
            n_1=result;
        }
        return result;
    }
}
