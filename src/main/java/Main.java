import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(0);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode five = new ListNode(4);
        ListNode six = new ListNode(5);
        ListNode seven = new ListNode(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;
        five.next = six;
        six.next = seven;
        sol.reorderList(head);
        System.out.println(head);
    }
}

class Solution {
    public void reorderList(ListNode head) {
        ListNode current = head;
        int i = 0;
        ListNode oddHead = null;
        ListNode prevEven = null;
        while (current != null) {
            //Base Case
            if (i == 0) {
                prevEven = current;
                i++;
                current = current.next;
            } else if (i == 1) {
                oddHead = current;
                i++;
                current = current.next;
                oddHead.next = null;
            } else if (i % 2 == 0) {
                prevEven.next = current;
                prevEven = current;
                i++;
                current = current.next;
            } else {
                ListNode next = current.next;
                current.next = oddHead;
                oddHead = current;
                current = next;
                i++;
            }
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
