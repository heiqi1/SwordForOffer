public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if(str==null||str.length()==0)return "";
        //计算空格数
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        int oldIndex=str.length()-1;    //替换前的最右下标
        int newLen=str.length()+2*count;//计算空格转换成%20之后的str长度
        int newIndex=newLen-1;          //完全替换后最右的下标
        str.setLength(newLen);          //设置长度，防止越界
        for(;oldIndex>=0 && oldIndex<newLen;--oldIndex){
            if(str.charAt(oldIndex)==' '){
                str.setCharAt(newIndex--,'0');
                str.setCharAt(newIndex--,'2');
                str.setCharAt(newIndex--,'%');
            }else{
                str.setCharAt(newIndex--,str.charAt(oldIndex));
            }
        }
        //转换成string格式
        return str.toString();
    }
}
