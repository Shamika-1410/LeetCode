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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int n = len - 1;
        temp = head;
        int ans = 0;
        while(temp!=null){
            ans += (temp.val)*(Math.pow(2,n));
            temp = temp.next;
            n--;
        }
        return ans;
    }
}