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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int c=0;
        while(head!=null && (c<n/2)){
            head=head.next;
            c++;
        }
        return head;
    }
}