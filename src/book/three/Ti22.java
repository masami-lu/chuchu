package book.three;

public class Ti22 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null||k==0){
            return null;
        }
        ListNode a=head;
        ListNode b=head;
        for (int i=0;i<k-1;i++){
            if (a.next!=null){
                a=a.next;
            }else {
                return null;
            }
        }
        b=head;
        while (a.next!=null){
            a=a.next;
            b=b.next;
        }
        return b;
    }

    void test1(){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        ListNode b=getKthFromEnd(n1,4);
        System.out.println(b.val);
    }
}
