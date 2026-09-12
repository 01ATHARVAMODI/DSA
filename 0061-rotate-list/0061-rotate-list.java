/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int n = 0;
        ListNode t = head;

        while (t != null) {
            n++;
            t = t.next;
        }

        k = k % n;

        for (int i = 0; i < k; i++) {
            ListNode p = head;

            while (p.next.next != null)
                p = p.next;

            ListNode x = p.next;
            p.next = null;
            x.next = head;
            head = x;
        }

        return head;
    }
}