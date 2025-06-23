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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int len = 0;
        while(node!=null){
            len++;
            node = node.next;
        }
        node = head;
        ListNode prev = head;
        if(n==len)return head.next;
        int i=0;
        while(i<len-n){
            prev = node;
            node = node.next;
            i++;
        }
        prev.next = node.next;
        return head;
    }
}