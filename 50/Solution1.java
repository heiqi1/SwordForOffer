//第一个只出现一次的字符
public class Solution1 {
    public int FirstNotRepeatingChar(String str) {
        if(str==null||str.length()==0)return -1;
        char[] c=str.toCharArray();
        int[] map=new int[256];
        for(int i=0;i<c.length;i++){
            map[c[i]]++;
        }
        for(int i=0;i<c.length;i++){
            if(map[c[i]]==1)return i;
        }
        return -1;
    }
}
