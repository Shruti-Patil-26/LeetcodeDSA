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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newhead=new ListNode(-1);
        ListNode temp=head,cur=newhead;
        while(temp!=null)
        {
            if(temp.val==val)
            {
                // cur.next=temp.next;
                // cur=cur.next;
                temp=temp.next;
            }
            else
            {
                cur.next=temp;
                cur=cur.next;
                // if(temp.next!=null)
                    temp=temp.next;
            }
            
        }
        cur.next=temp;
        return newhead.next;
    }
}