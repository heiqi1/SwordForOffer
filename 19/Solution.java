/**
1. 需要匹配的字符串和模式字符串都已经遍历完成，那么就是匹配成功的。
1. 如果需要匹配的字符串没有遍历完，模式字符串已经匹配完，后面的字符串不能匹配，那么就是不匹配
1. 如果不是上面两个情况，那么首先看一下模式串当前字符下一个字符是否是*，
- 如果下一个字符是*且当前需要匹配的字符和模式当前字符匹配（相同或者为.）
  1. 就可以匹配下一个字符串（匹配字符串匹配下一个，模式字符串向后移动两个），即（strIndex+1,patternIndex+2）
  2. 下一个字符也使用当前模式，即（strIndex+1,patternIndex）
  3. 是当前字符使用下一个模式来匹配，即（strIndex,patternIndex+2）
- 如果当前字符不匹配，那么就使用下一个模式匹配当前字符，即（strIndex,patternIndex+2）
- 如果模式字符下一个不是*，那么就看当前字符和当前模式是否匹配，如果匹配，那么就行判断下一个字符和后面的模式是否匹配，即（strIndex+1,patternIndex+1）。否则就是不匹配的。
*/

public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null)return false;
        return matchCore(str,0,pattern,0);
    }
    private boolean matchCore(char[] str,int strIndex,char[] pattern,int patternIndex){
        //已经匹配
        if(str.length==strIndex&&pattern.length==patternIndex)return true;
        //模式字符串已经结束，但是字符串还未结束
        if(strIndex<str.length&&pattern.length==patternIndex)return false;
        //如果存字符串*
        if(patternIndex<pattern.length-1&&pattern[patternIndex+1]=='*'){
            if(strIndex<str.length&&(str[strIndex]==pattern[patternIndex]||pattern[patternIndex]=='.')){
                //当前这个X*匹配当前字符
                return matchCore(str,strIndex,pattern,patternIndex+2)//后面的字符可以继续用这个模式匹配
                    ||matchCore(str,strIndex+1,pattern,patternIndex+2)//当前的字符使用下一个模式匹配
                    ||matchCore(str,strIndex+1,pattern,patternIndex);//当前字符不使用当前模式匹配，使用后面的（因为*可以为匹配0次）
            }else{
            //当前X*不匹配当前字符，模式向后移动到*字符串后面
                return matchCore(str,strIndex,pattern,patternIndex+2);
            }
        }
        //当前模式的后一个字符不是*
        if(strIndex<str.length&&(str[strIndex]==pattern[patternIndex]||pattern[patternIndex]=='.')){
            return matchCore(str,strIndex+1,pattern,patternIndex+1);
        }
        return  false;
    }
}
