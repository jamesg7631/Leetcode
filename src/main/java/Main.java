import java.util.List;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test Case 1
//        ListNode head = new ListNode(3);
//        ListNode second = new ListNode(2);
//        ListNode third = new ListNode(0);
//        ListNode fourth = new ListNode(-4);
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = second;
        // Test Case 2
//        ListNode head = new ListNode(1);
//        ListNode second = new ListNode(2);
//        head.next = second;
//        second.next = head;
        // Test Case 3
        ListNode head = new ListNode(1);
        System.out.println(sol.hasCycle(head));
    }
}
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        slow = slow.next;
        fast = slow.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}