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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        if(k==0)
            return head;
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        int rem=n-(k%n);
        if(rem==n)
            return head;
        int i=1;
        temp=head;
        while(i<rem)
        {
            i++;
            temp=temp.next;
        }
        ListNode nextn=temp.next,lastn=temp.next;
        if(lastn!=null)
        {
            while(lastn.next!=null)
                lastn=lastn.next;
        }

        
        temp.next=null;
        lastn.next=head;
        head=nextn;
        return head;
    }
}