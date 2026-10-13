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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head = null;
        ListNode temp = null;
        int carryOver = 0;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carryOver;
            if(sum > 9){
                carryOver = 1;
            } else {
                carryOver = 0;
            }
            sum = sum % 10;
            if(head == null){
                head = new ListNode(sum);
                temp = head;
            } else {
                ListNode nxt = new ListNode(sum);
                temp.next = nxt;
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + carryOver;
            if(sum > 9){
                carryOver = 1;
            } else {
                carryOver = 0;
            }
            temp.next = new ListNode(sum % 10);
            //carryOver = 0;
            temp = temp.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            int sum = l2.val + carryOver;
            if(sum > 9){
                carryOver = 1;
            } else {
                carryOver = 0;
            }
            temp.next = new ListNode(sum % 10);
            //temp.next = new ListNode(l2.val + carryOver);
            //carryOver = 0;
            temp = temp.next;
            l2 = l2.next;
        }

        if(l1 == null && l2 == null && carryOver == 1){
            temp.next = new ListNode(carryOver);
        }

        return head;
    }
}
