public class Solution {
    ArrayList<String> result=new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if(str==null||str.length()==0)return result;
        StringBuffer temp=new StringBuffer();
        boolean[]  flag=new boolean[str.length()];
        Permutation(str,0,flag,temp,result);
        return result;
    }
    private void Permutation(String str,int index,boolean[]  flag,StringBuffer temp,ArrayList<String> result){
        if(index==str.length()&&!result.contains(temp.toString())){
            result.add(temp.toString());
            return;
        }
        for(int i=0;i<str.length();i++){
            if(flag[i]==false){
                flag[i]=true;
                temp.append(str.charAt(i));
                Permutation(str,index+1,flag,temp,result);
                flag[i]=false;
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
}
