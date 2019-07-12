/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // base case
        if (l1 == null && l2 == null) return null;
        
        // create new node
        int val1 = l1 != null ? l1.val : 0;
        int val2 = l2 != null ? l2.val : 0;
        int total = val1 + val2;
        ListNode current = new ListNode(total%10);
        
        // deal with passing to next
        ListNode next1 = l1 != null ? l1.next : null;
        ListNode next2 = l2 != null ? l2.next : null;
        
        // deal with carry
        if (total >= 10) {
            if (next1 != null) {
                next1.val += 1;
            } else if (next2 != null) {
                next2.val += 1;
            } else {
                next1 = new ListNode(1);
            }
        }
        
        // create recursion
        current.next = addTwoNumbers(next1, next2);
        return current;
    }
}