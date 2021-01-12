package LeedCode;

public class CycleList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }

    //相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        while (a!=b){
            a=a!=null?a.next:headB;
            b=b!=null?b.next:headA;
        }
        return a;
    }

    //反转链表
    public ListNode reverseList(ListNode head) {
        if(head.next == null || head.next.next == null) {
            return null;
        }
        ListNode cur=head;
        ListNode next=null;
        ListNode reserve=new ListNode(0);
        while (cur!=null){
            next=cur.next;
            cur.next=reserve.next;
            reserve.next=cur;
            cur=next;
        }
        head.next=reserve.next;
        return head;
    }

    //检测环形链表
    public ListNode detectCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (true){
            if (fast==null||fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                break;
            }
        }
        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    //判断有误环形链表
    public boolean hasCycle(ListNode head,int pos){
        boolean flag=true;
        int len=0;
        while (head.next!=null){
            len++;
            head=head.next;
        }
        if (pos<0||pos>len){
            flag=false;
        }
        return flag;
    }

    public void test(){
        ListNode node1=new ListNode(3);
        ListNode node2=new ListNode(4);
        ListNode node3=new ListNode(2);
        ListNode node4=new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        boolean result=hasCycle(node1,-2);
        System.out.println(result);
    }

    public void testIntersection(){
        //A
        ListNode node1=new ListNode(3);
        ListNode node2=new ListNode(4);
        ListNode node3=new ListNode(2);
        ListNode node4=new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        //B
        ListNode node5=new ListNode(1);
        ListNode node6=new ListNode(2);
        ListNode node7=new ListNode(6);
        node5.next=node6;
        node6.next=node7;

        ListNode result=getIntersectionNode(node1,node5);
        System.out.println(result.val);
    }

    public static void main(String[] args) {
        CycleList cycleList=new CycleList();
//        cycleList.test();
        cycleList.testIntersection();


    }

}


