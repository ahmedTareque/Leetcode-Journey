# LeetCode-Palindrome_Linked_List

Given the head of a singly linked list, return true if it is a palindrome.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9

![Question](question.png?raw=true "Question")

//Solution Logic:
1. Divide Linked List in two parts where 2nd half have to be reverive of the 1st half logically.
2. So, 1st half can be stored in fast. then, 2nd half will be in slow but in reverse order.
3. Now, we need to invert that 2nd order to compare with 1st order. If value matches return true otherwise false. 