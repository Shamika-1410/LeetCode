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
        int carry = 0;
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode head = new ListNode();
        ListNode ans = head;
        ListNode prev = head;
        while(head1!=null && head2!=null){
            int a = head1.val;
            int b = head2.val;
            int sum = a + b + carry;
            if(sum>=10){
                carry = sum/10;
                head.val = sum%10;
            }else{
                carry = 0;
                head.val = sum;
            }
            prev = head;
            head.next = new ListNode();
            head = head.next; 
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1!=null){
            int a = head1.val;
            int sum = carry + a;
            if(sum>=10){
                carry = sum/10;
                head.val = sum%10;
            }else{
                carry = 0;
                head.val = sum;
            }
            prev = head;
            head.next = new ListNode();
            head = head.next; 
            head1 = head1.next;
        }
        while(head2!=null){
            int a = head2.val;
            int sum = carry + a;
            if(sum>=10){
                carry = sum/10;
                head.val = sum%10;
            }else{
                carry = 0;
                head.val = sum;
            }
            prev = head;
            head.next = new ListNode();
            head = head.next; 
            head2 = head2.next;
        }
        if(carry!=0){
            head.val = carry;
            return ans;
        }
        prev.next = null;
        return ans;
    }
}