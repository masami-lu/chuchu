package book.three;

import java.util.Arrays;

public class  Ti24{
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    ListNode ReverseList(ListNode pHead){
        ListNode p_pre=null;
        ListNode p=pHead;
        ListNode p_reverse=null;
        while (p!=null){
            ListNode p_next=p.next;
            if (p.next==null){
                p_reverse=p;
            }
            p.next=p_pre;
            p_pre=p;
            p=p_next;

        }
        return p_reverse;
    }
    void  test1(){
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
        ListNode result=ReverseList(n5);
        System.out.println(result);
    }

    void test2(){
        ListNode n=null;
        n.next=null;
        ListNode r=ReverseList(n);
        System.out.println(r.val);
    }

}
