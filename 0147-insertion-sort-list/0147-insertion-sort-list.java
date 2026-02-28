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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0); // sorted part dummy
        ListNode current = head;

        while (current != null) {
            ListNode prev = dummy;
            ListNode next = current.next;

            // Find correct position in sorted list
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert current between prev and prev.next
            current.next = prev.next;
            prev.next = current;

            current = next;
        }

        return dummy.next;
    }
}