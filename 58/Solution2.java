//题目二：左旋转字符串
public class Solution2 {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0)return "";
        char[] c=str.toCharArray();
        reverse(c,0,n-1);
        reverse(c,n,c.length-1);
        reverse(c,0,c.length-1);
        return new String(c);
    }
    private void reverse(char[] c,int low,int high){
        while(low<high){
            char temp=c[high];
            c[high]=c[low];
            c[low]=temp;
            low++;
            high--;
        }
    }
}
