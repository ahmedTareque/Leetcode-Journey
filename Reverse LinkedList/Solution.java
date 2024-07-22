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
        ListNode prev = null;
        //INPUT = 1->2->3->4->5->NULL
        //OUTPUT = 5->4->3->2->1->NULL
        while(head!=null){
            //First tracing while head=1 from input
            //now, next = 2 as head.next = 2
            ListNode next = head.next;
            //now head.next = null. which means the node is now 1->NULL
            head.next = prev;
            //now prev = 1
            prev = head;
            //now head = 2, which means the node is now 2->1->NULL
            head = next;
        }
        return prev;
    }
}