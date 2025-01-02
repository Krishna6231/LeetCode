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
        ListNode temp= head;
        int size=-1;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int ans = 0;
        while(head!=null){
            if(head.val==1){
                int num = (1<<size);
                size--;
                ans = num | ans;
            }
            else{
                size--;
                ans = 0 | ans ;
            }
            head=head.next;
        }
        return ans;
    }
}