//把字符串转换成整数
public class Solution{
    public int StrToInt(String str){
        if(str==null||str.length()==0)return 0;
        char[] chars=str.toCharArray();
        boolean flag=chars[0]=='-';
        int result;
        for(int i=0;i<chars.length;i++){
            if(i==0&&(chars[0]=='+'||chars[0]=='-'))continue;
            if(chars[i]>'9'||chars[i]<'0')return 0;
            result=result*10+(chars[i]-'0');
        }
        return flag>0?-result:result;
    }
}
