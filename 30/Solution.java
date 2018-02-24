//包含min函数的栈
public class Solution {
    Stack<Integer>  data=new Stack<>();//数据栈
    Stack<Integer>  min=new Stack<>(); //辅助栈
    public void push(int node) {
        if(min.empty()){//辅助栈为空
            min.push(node);
        }else{//不为空
            int top=min.peek();
            if(node<=top){//若是当前元素小于最小栈的栈顶元素
                min.push(node);
            }else{//不小于时，将最小栈的栈顶元素再次进栈
                min.push(min.peek());
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
     
    public int top() {
        return data.peek();
    }
     
    public int min() {
        if(min.empty())
            return 0;
        return min.peek();
    }
}
