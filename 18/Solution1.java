//在O(1)时间内删除链表节点
public class Solution1{
    public  class ListNode{
        public int data;
        public ListNode next;
        public ListNode(int data,ListNode next){
            this.data=data;
            this.next=next;
        }
    }
    public  ListNode  deleteNode(ListNode head,ListNode node){
        //删除尾节点
        if(node.next==null){
            while(head.next!=null){
                head=head.next;
            }
            head.next=null;
        //删除头节点
        }else if(head==node){
            head=null;
        }else{
        //将node下一个节点值复制到node上，覆盖node的节点值，等同于node.next.data移动到node.data上
        //然后删除node.next这个节点
            node.data=node.next.data;
            node.next=node.next.next;
        }
    }
}
