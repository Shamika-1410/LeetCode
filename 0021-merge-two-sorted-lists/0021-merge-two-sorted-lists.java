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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)return null;
        ListNode head = new ListNode();
        ListNode prev = head;
        ListNode ans = head;
        ListNode head1=list1,head2=list2;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                head.val = head1.val;
                head1=head1.next;
            }else{
                head.val = head2.val;
                head2=head2.next;
            }
            ListNode n = new ListNode();
            head.next = n;
            prev = head;
            head = head.next;
        }
        while(head1!=null){
            head.val = head1.val;
            head1=head1.next;
            ListNode n = new ListNode();
            head.next = n;
            prev = head;
            head = head.next;
        }
        while(head2!=null){
            head.val = head2.val;
            head2=head2.next;
            ListNode n = new ListNode();
            head.next = n;
            prev = head;
            head = head.next;
        }
        prev.next=null;
        return ans;
    }
}