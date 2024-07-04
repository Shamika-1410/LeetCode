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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead = new ListNode();
        ListNode huh = newHead;
        head = head.next;
        int sum = 0;
        while(head!=null){
            if(head.val!=0){
                sum+=head.val;
            }else{
                if(newHead!=null)
                    newHead.val = sum;
                sum=0;
                if(head.next!=null){
                    newHead.next = new ListNode();
                    newHead = newHead.next;
                    //System.out.println("HI!!!!!!");
                }
            }
            head=head.next;
        }
        return huh;
    }
}