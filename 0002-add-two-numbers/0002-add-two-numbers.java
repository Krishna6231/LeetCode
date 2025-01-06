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
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode head1 = A;
        ListNode head2 = B;
        ListNode dummy=new ListNode(-10);
        ListNode td = dummy;
        int carry=0;
        while(head1!=null && head2!=null){
            
            int add = head1.val+head2.val+carry;
            carry=0;
            if(add>9){
                carry = add/10;
                ListNode num = new ListNode(add%10);
                dummy.next = num;
                dummy=num;
            }
            else{
                ListNode num = new ListNode(add);
                dummy.next = num;
                dummy=num;
            }

            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null){
            int add = head1.val+carry;
            carry=0;
            if(add>9){
                carry = add/10;
                ListNode num = new ListNode(add%10);
                dummy.next = num;
                dummy=num;
                }
            else{
                ListNode num = new ListNode(add);
                dummy.next = num;
                dummy=num;
            }
            head1=head1.next;
            
        }
        while(head2!=null){
            int add = head2.val+carry;

            carry=0;
            if(add>9){
                carry = add/10;
                ListNode num = new ListNode(add%10);
                dummy.next = num;
                dummy=num;
            }
            else{
                ListNode num = new ListNode(add);
                dummy.next = num;
                dummy=num;
            }
            head2=head2.next;
        }
        
        
        if(carry>0){
        ListNode num = new ListNode(carry);
                dummy.next = num;
                dummy=num;
        }
        return (td.next);
    }
}