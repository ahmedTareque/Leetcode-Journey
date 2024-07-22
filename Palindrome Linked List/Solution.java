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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head, slow=head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;
        
        while (slow != null){
            if (slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
        
public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        //INPUT = 1->2->3->4->5->NULL
        //OUTPUT = 5->4->3->2->1->NULL
        while(head!=null){
            //First tracing while head=1 from input
            ListNode next = head.next;
            head.next = prev;
            //now, next = 2 as head.next = 2
            //now head.next = null. which means the node is now 1->NULL
            prev = head;
            //now prev = 1
            head = next;
            //now head = 2, which means the node is now 2->1->NULL
        }
        return prev;
    }
}