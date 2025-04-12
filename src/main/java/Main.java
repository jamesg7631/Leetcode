import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test Case 1
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sol.removeNthFromEnd(head, 2);
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        int numberOfFastJump = 0;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            numberOfFastJump++;
        }
        int length;
        if (fast == null) {
            length = 2 * numberOfFastJump;
        } else {
            length = (2 * numberOfFastJump) + 1;
        }
        int middleIndex = length / 2;
        int removalIndex = length - n;
        int i;

        if (removalIndex < middleIndex) {
            prev = null;
            slow = head;
            i = 0;
        } else {
            i = middleIndex;
        }
        while (i < removalIndex) {
            prev = slow;
            slow = slow.next;
            i++;
        }

        if (i == length - 1) {
            prev.next = null;
        } else {
            ListNode next = slow.next;
            prev.next = next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
