/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode dummy = headA;
        while(dummy!=null){
            set.add(dummy);
            dummy = dummy.next;
        }
        dummy = headB;
        while(dummy!=null){
            if(set.contains(dummy)){
                break;
            }
            dummy = dummy.next;
        }
        return dummy;
    }
}