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
    public ListNode merge(ListNode temp1,ListNode temp2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }
            else
            {
                temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        if(temp1!=null)
        {
            temp.next=temp1;
        }
        else
            temp.next=temp2;

        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        
        ListNode head=lists[0];
        for(int i=1;i<lists.length;i++)
        {
            head=merge(head,lists[i]);
        }
        return head;
    }
}