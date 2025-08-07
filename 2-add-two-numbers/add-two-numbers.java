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
        int sum=l1.val+l2.val;
        int h=sum/10;
        ListNode solHead=new ListNode(sum%10);
        ListNode prev=solHead;

        l1=l1.next;
        l2=l2.next;
        while(l1!=null && l2!=null)
        {
            sum=l1.val+l2.val+h;
            h=sum/10;
            ListNode temp=new ListNode(sum%10);
            prev.next=temp;
            prev=temp;

            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null && l2==null)
        {
            if(h!=0)
            {
                ListNode temp=new ListNode(h);
                prev.next=temp;
            }
            return solHead;
            
        }
            

        if(l1==null)
        {
            while(l2!=null)
            {
                sum=0+l2.val+h;
                h=sum/10;
                ListNode temp=new ListNode(sum%10);
                prev.next=temp;
                prev=temp;

                l2=l2.next;
            }
        }
        if(l2==null)
        {
            while(l1!=null)
            {
                sum=l1.val+0+h;
                h=sum/10;
                ListNode temp=new ListNode(sum%10);
                prev.next=temp;
                prev=temp;

                l1=l1.next;
                
            }
        }
        if(h!=0)
        {
            ListNode temp=new ListNode(h);
            prev.next=temp;
        }
        return solHead;
    }
}