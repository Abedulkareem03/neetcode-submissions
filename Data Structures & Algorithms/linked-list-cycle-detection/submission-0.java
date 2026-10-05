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
        ListNode firstNode = head;
        ListNode secondNode = head;

        while (secondNode != null) {
            if (secondNode.next == null){
                return false;
            }
            secondNode = secondNode.next.next;
            firstNode = firstNode.next;

            if(secondNode == firstNode) {
                return true;
            }
        }
        return false;
    }
}
