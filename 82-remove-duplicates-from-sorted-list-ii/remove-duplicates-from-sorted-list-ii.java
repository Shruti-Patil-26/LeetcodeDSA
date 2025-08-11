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
        if(head.val==head.next.val)
        {
            while(head.val==head.next.val)
            {
                while(head.val==head.next.val)
                {
                    head=head.next;
                    if(head.next==null)
                        break;
                }
                head=head.next;
                if(head==null || head.next==null)
                        break;
            }
            // if()
            // head=head.next;
        }
        if(head==null)
            return head;
        ListNode prev=head;
        ListNode temp=head.next;

        while(temp!=null && temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                while(temp.val==temp.next.val)
                {
                    temp=temp.next;
                    if(temp.next==null)
                        break;
                }
                
                temp=temp.next;
            }
            else
            {
                prev.next=temp;
                prev=temp;
                temp=temp.next;
            }
        }
        prev.next=temp;
        return head;
    }
}