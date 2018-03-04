//字符流中第一个只出现一次的字符
public class Solution2 {
    int[] map=new int[256];
    StringBuffer sb=new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
        map[ch]++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chars=sb.toString().toCharArray();
        for(char c:chars){
            if(map[c]==1)
                return c;
        }
        return '#';
    }
}
