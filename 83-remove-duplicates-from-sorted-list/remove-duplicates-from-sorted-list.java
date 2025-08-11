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
        if(head==null || head.next==null)
            return head;
        ListNode prev=head;
        ListNode nextn=head.next;
        while(nextn!=null)
        {
            if(prev.val==nextn.val)
            {
                prev.next=nextn.next;
                nextn=nextn.next;
                continue;
            }

            prev=prev.next;
            nextn=nextn.next;
        }
        return head;
    }
}