//题目一：翻转字符串
public class Solution1 {
    public String ReverseSentence(String str) {
        if(str==null||str.length()==0)return "";
        char[] c=str.toCharArray();
        reverse(c,0,c.length-1);
        int blank=-1;
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                int nextBlank=i;
                reverse(c,blank+1,nextBlank-1);
                blank=nextBlank;
            }
        }
        reverse(c,blank+1,c.length-1);
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
