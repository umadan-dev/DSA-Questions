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
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode sum = new ListNode((head1.val + head2.val)%10);
        ListNode head3 = sum;
        int carry = (head1.val + head2.val)/10;
        int addition = 0;
        while(head1.next !=null && head2.next !=null)
        {
            addition = head1.next.val + head2.next.val + carry;
            head3.next = new ListNode(addition%10) ;
            carry = addition/10;
            head3 = head3.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        while (head1.next != null){
            addition = head1.next.val + carry;
            head3.next = new ListNode(addition%10) ;
            carry = addition/10;
            head3 = head3.next;
            head1 = head1.next;
        }
        while (head2.next != null){
            addition = head2.next.val + carry;
            head3.next = new ListNode(addition%10) ;
            carry = addition/10;
            head3 = head3.next;
            head2 = head2.next;
        }
        if (carry!=0){
            head3.next = new ListNode(carry);
        }
        
        return sum;
    }
}
