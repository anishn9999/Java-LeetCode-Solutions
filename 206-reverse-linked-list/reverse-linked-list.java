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
    public ListNode reverseList(ListNode head) {
        ListNode p=null;
        ListNode cu = head;
        while (cu!=null) {
            ListNode next = cu.next;
            cu.next=p;
            p=cu;
            cu=next;
        }

        return p;
    }
}