import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test Case 1
        Solution sol = new Solution();
//        ListNode head = new ListNode(0);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(2);
//        ListNode fourth = new ListNode(3);
//        ListNode five = new ListNode(4);
//        ListNode six = new ListNode(5);
//        ListNode seven = new ListNode(6);
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = five;
//        five.next = six;
//        six.next = seven;
        // Test Case 2
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(8);
        ListNode fifth = new ListNode(10);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sol.reorderList(head);
        System.out.println(head);
    }
}

class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode list1Head = head;
        ListNode list2Head = slow;
        ListNode prev = null;
        while (slow != null) {
            list2Head = slow;
            slow = slow.next;
            list2Head.next = prev;
            prev = list2Head;
        }

        ListNode nextList1 = list1Head.next;
        ListNode nextList2 =list2Head;
        ListNode current = list1Head;
        int i = 0;
        while (current.next != null) {
            if (i % 2 == 0) {
                current.next = nextList2;
                current = current.next;
                nextList2 = current.next;
            } else if (i % 2 == 1) {
                current.next = nextList1;
                current = current.next;
                nextList1 = current.next;
            }
            i++;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


}
