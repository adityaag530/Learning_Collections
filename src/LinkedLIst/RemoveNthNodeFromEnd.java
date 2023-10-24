package LinkedLIst;
/*
 * @author adityagupta
 * @date 24/10/23
 */

import java.util.LinkedList;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode answer = removeNthFromEnd(root, 4);
        System.out.println("Inside Main Function");
        while(answer!=null){
            System.out.print(answer.val + " ");
            answer = answer.next;
        }

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //1 2 3 4 5
        System.out.println("Inside remove function");
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        System.out.println(fast.val);
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
