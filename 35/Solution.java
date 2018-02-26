public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)return pHead;
        RandomListNode cur=pHead;
        //复制每个节点，如节点A得到A’，将节点A'插入到节点A后面
        while(cur!=null){
            RandomListNode  node=new RandomListNode(cur.label);
            node.next=cur.next;
            cur.next=node;
            cur=node.next;
        }
        cur=pHead;
        //重新遍历链表，复制老节点的随机指针给新节点
        while(cur!=null){
            if(cur.random!=null)
                cur.next.random=cur.random.next;
            cur=cur.next.next;
        }
        //拆分链表，将链表拆分为原链表和复制后的链表
        RandomListNode head=pHead.next;
        RandomListNode temp=head;
        cur=pHead;
        while(cur.next!=null){
            temp=cur.next;
            cur.next=temp.next;
            cur=temp;
        }
        return head;
    }
}
