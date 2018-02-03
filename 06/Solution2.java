//修改链表，先翻转链表，再放入列表中
public class Solution2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result=new ArrayList<>();
        if(listNode==null)return result;
        ListNode head=reverse(listNode);
        while(head!=null){
            result.add(head.val);
            head=head.next;
        }
        return result;
    }
    //翻转链表
    private ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
        //临时链表节点
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
