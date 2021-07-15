package book.two;

import java.util.LinkedList;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}

public class Ti6 {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack=new LinkedList<Integer>();
        while (head.next!=null){
            stack.addLast(head.val);
            head=head.next;
        }
        int[] res=new int[stack.size()];
        for (int i=0;i<res.length;i++){
            res[i]=stack.removeFirst();
        }
        return res;
    }
}
