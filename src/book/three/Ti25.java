package book.three;

public class Ti25 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)
            return l2;
        if (l2==null)
            return l1;
        ListNode pHead=null;
        if (l1.val>l2.val){
            pHead=l1;
            pHead.next=mergeTwoLists(l1.next,l2);
        }
        else {
            pHead=l2;
            pHead.next=mergeTwoLists(l1,l2.next);
        }
        return pHead;
    }
    void  test1(){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);
        n1.next=n4;
        n2.next=n3;
        n3.next=n6;
        n4.next=n5;
        n5.next=n7;
        ListNode result=mergeTwoLists(n1,n2);
        System.out.println(result);
    }
}
