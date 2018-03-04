//队列的最大值
public class Solution2 {
    Stack<Integer>  data=new Stack<>();
    Stack<Integer>  max=new Stack<>();
    public void push(int node) {
        if(max.empty()){
            max.push(node);
        }else{
            int top=max.peek();
            if(node>=top){
                max.push(node);
            }else{
                max.push(max.peek());
            }
        }
        data.push(node);
    }
    public void pop() {
        if(data.empty()||min.empty())
            return;
        data.pop();
        min.pop();
    }
    public int max() {
        if(min.empty())
            return 0;
        return max.peek();
    }
}
