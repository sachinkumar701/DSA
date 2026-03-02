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
    public ListNode removeNodes(ListNode head) {
        // Step 1: Reverse the list
        head = reverse(head);
        
        int maxSoFar = head.val;
        ListNode current = head;
        
        // Step 2: Remove nodes smaller than maxSoFar
        while (current != null && current.next != null) {
            if (current.next.val < maxSoFar) {
                current.next = current.next.next;
            } else {
                current = current.next;
                maxSoFar = current.val;
            }
        }
        
        // Step 3: Reverse again
        return reverse(head);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}