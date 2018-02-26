public class Solution {
    int index=-1; //计数变量
    String Serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        if (root==null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        String[]  strings=str.split(",");
        TreeNode node=null;
        if (!strings[index].equals("#")){
            node=new TreeNode(Integer.valueOf(strings[index]));
            node.left=Deserialize(str);
            node.right=Deserialize(str);
        }
        return node;
    }
}
