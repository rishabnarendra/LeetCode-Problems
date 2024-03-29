/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null; 
        if(l1 == null) return l2; 
        if(l2 == null) return l1; 
        
        ListNode result = new ListNode(0);
        ListNode merge = result; 
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                merge.next = l1; 
                l1 = l1.next; 
            }
            else if(l1.val > l2.val) {
                merge.next = l2;
                l2 = l2.next; 
            }
            merge = merge.next; 
        }
        if(l1 != null) merge.next = l1; 
        if(l2 != null) merge.next = l2; 
        return result.next;
    }
}