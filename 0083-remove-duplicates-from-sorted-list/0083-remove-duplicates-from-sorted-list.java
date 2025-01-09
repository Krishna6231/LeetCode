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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-10);
        ListNode td = dummy;

        while(head!=null){
            while(head.next!=null && head.val==head.next.val){
                head=head.next;
            }
            dummy.next=head;
            dummy=dummy.next;
            head=head.next;
        }
        return td.next;
    }
}