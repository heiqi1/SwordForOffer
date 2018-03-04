//面试题48：最长不含重复字符的子字符串
public class Solution{
    public int LongestSubstring(String str){
        int curLen=0;
        int maxLen=0;
        // 0~25表示a~z，position[0] = index,表明a上次出现在index处
        int[] position=new int[26];
        for(int i=0;i<26;i++){
            position[i]=-1;
        }
        for(int i=0;i<str.length();i++){
            int preIndex=position[str.charAt(i)-'a'];
            // 字符第一次出现，或者d > f(i -1)
            if(preIndex==-1||i-preIndex>curLen)curLen++;
            // d <= f(i -1) 
            else{
                if(curLen>maxLen)maxLen=curLen;
                curLen=i-preIndex;
            }
            // 记录当前字符出现的位置
            position[str.charAt(i)-'a']=i;
        }
        if(curLen>maxLen)maxLen=curLen;
        return maxLen;
    }
}
