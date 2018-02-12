//删除链表中重复的节点
public class Solution2 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)return pHead;
        ListNode dumpy=new ListNode(0); //新建头节点
        ListNode pre=dumpy;             //前一个节点
        ListNode cur=pHead;             //当前节点
        dumpy.next=pHead;               //新建头节点指向pHead
        //节点不为空
        while(cur!=null&&cur.next!=null){
            if(cur.val==cur.next.val){
                int value=cur.val;      //因为cur节点会后移，所以用value保存这个值
                //当出现连续相同的节点时，就将cur节点指向它的下一个节点
                while(cur!=null&&cur.val==value){
                    cur=cur.next;
                }
                //删除重复节点
                pre.next=cur;
            }else{
            //不相等时，节点后移
                pre=cur;
                cur=cur.next;
            }
        }
        return dumpy.next;
    }
}
