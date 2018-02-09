public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null)return head;
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
