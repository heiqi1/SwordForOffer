//表示数值的字符串
public class Solution {
    public boolean isNumeric(char[] str) {
        if(str==null||str.length==0)return false;
        boolean flag=false;//标志位，即+/-
        boolean decimal=false;//小数点位
        boolean hasE=false;//是否存在e、E
        for(int i=0;i<str.length;i++){
            if(str[i]=='e'||str[i]=='E'){
                if(i==str.length-1)return false;//e后面一定要有数组
                if(hasE)return false;//不能同时存在两个E
                hasE=true;
            }else if(str[i]=='+'||str[i]=='-'){
                //第二次出现+-符号，则必须跟在e之后
                if(flag&&str[i-1]!='e'&&str[i-1]!='E')return false;
                //第一次出现+-符号，且不是在字符串开头，则也必须紧接着e之后
                if(!flag&&i>0&&str[i-1]!='e'&&str[i-1]!='E')return false;
                flag=true;
            }else if(str[i]=='.'){
                //e之后不能接小说点，小说点不能出现两次
                if(hasE||decimal)return false;
                decimal=true;
            }else if(str[i]<'0'||str[i]>'9'){//不合法字符
                return false;
            }
        }
        return true;
    }
}
