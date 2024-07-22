# Reversed_Linked_List
LeetCode Reversed Linked List Problem solution in Java

Question - 
Given the head of a singly linked list, reverse the list, and return the reversed list.

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]



![Question](question.png?raw=true "Question")


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

//Solution Logic:
1. ListNode has 2 variables; 
2. If '1' is found increase island number and make it '0' 
3. Then look around [up,down,left,right] to find more '1' and make it '0' everytime.
4. Then go for 2nd row and repeat