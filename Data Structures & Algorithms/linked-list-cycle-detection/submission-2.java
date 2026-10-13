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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        return detectCycle(head, head.next);
        
    }

    public boolean detectCycle(ListNode node1, ListNode node2){
        if(node1 == null || node2 == null || node2.next == null){
            return false;
        }

        if(node1.val == node2.val){
            return true;
        }

        return detectCycle(node1.next, node2.next.next);
    }
}
