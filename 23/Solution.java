/**
1. 第一步，找环中相汇点。
   分别用slow，fast指向链表头部，slow每次走一步，fast每次走二步，直到slow==fast找到在环中的相汇点。
2. 第二步，找环的入口。
   接上步，当slow==fast时，fast所经过节点数为2x,slow所经过节点数为x,
   设环中有n个节点,fast比slow多走一圈有2x=n+x; n=x;可以看出slow实际走了一个环的步数，
   再让result指向链表头部，slow位置不变，slow,result每次走一步直到slow==fast; 此时p1指向环的入口。
*/
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null)return pHead;
        ListNode slow=pHead;
        ListNode fast=pHead;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                ListNode result=pHead;
                while(result!=slow){
                    result=result.next;
                    slow=slow.next;
                }
                return result;
            }
        }
        return null;
    }
}
