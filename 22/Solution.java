public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)return head;
        ListNode dumpy=head;
        while(k-->0){
            if(head==null)return null;
            head=head.next;
        }
        while(head!=null){
            head=head.next;
            dumpy=dumpy.next;
        }
        return dumpy;
    }
}
