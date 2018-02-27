//两个链表的第一个公共节点
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null)return null;
        if(pHead2==null)return null;
        ListNode l1=pHead1;
        ListNode l2=pHead2;
        int len1=getLength(pHead1);
        int len2=getLength(pHead2);
        if(len1>=len2){
            l1=walkStep(l1,len1-len2);
        }else if(len1<len2){
            l2=walkStep(l2,len2-len1);
        }
        //开始齐头并进，直到找到第一个公共节点
        while(l1!=l2){
            l1=l1.next;
            l2=l2.next;
        }
        return l1;
    }
    //求链表的长度
    private int getLength(ListNode head){
        if(head==null)return 0;
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    //链表先走两链表的长度差
    private ListNode walkStep(ListNode head,int len){
        while(len>0){
            head=head.next;
            len--;
        }
        return head;
    }
}
