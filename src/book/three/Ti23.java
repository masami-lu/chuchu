package book.three;

public class Ti23 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode head){
        ListNode meet=MeetingNode(head);
        if (meet==null){
            return null;
        }
        int loop=1;
        ListNode p=meet;
        while (p.next!=meet){
            p=p.next;
            ++loop;
        }
        p=head;
        for (int i=0;i<loop;i++){
            p=p.next;
        }
        ListNode p2=head;
        while (p!=p2){
            p=p.next;
            p2=p2.next;
        }
        return p;
    }

    //判断是否存在环
    public ListNode MeetingNode(ListNode head){
        if (head==null){
            return null;
        }
        ListNode slow=head.next;
        if (slow==null){
            return null;
        }
        ListNode fast=slow.next;
        while (fast!=null&&slow!=null){
            if (fast==slow){
                return fast;
            }
            slow=slow.next;
            fast=fast.next;
            if (fast!=null){
                fast=fast.next;
            }

        }
        return null;
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
        n7.next=n4;
        ListNode result=EntryNodeOfLoop(n1);
        System.out.println(result.val);
    }

}
