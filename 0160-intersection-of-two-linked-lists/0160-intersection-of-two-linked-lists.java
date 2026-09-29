/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode x = a;
        ListNode y = b;

        while (x != y) {
            if (x == null)
                x = b;
            else
                x = x.next;

            if (y == null)
                y = a;
            else
                y = y.next;
        }

        return x;
    }
}