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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null || k==1)
            return head;
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        int iter=n/k;

        
        temp=head;
        boolean flag=true;
        ListNode nextn,nextnext=head,newHead=head,cur=head,prev=head;
        while(temp!=null)
        {
            nextn=temp.next;
            nextnext=nextn;
            // nextnext=nextn.next;
            // nextn.next=temp;
            // ListNode cur=temp;
            // temp=nextn;
            int k1=k;

            // ListNode prev=nextn;
            // nextn=nextnext;

            while(k1>1)
            {
                nextnext=nextn.next;
                nextn.next=temp;

                if(k1==k)
                    cur=temp;
                temp=nextn;
                prev=nextn;
                nextn=nextnext;
                k1--;
            }
            iter--;

            if(flag)
            {
                newHead=prev;
                flag=false;
            }
            if(iter==0)
            {
                 cur.next=nextnext;
                 break;
            }
            else
            {
                ListNode t1=nextnext;
                int k2=k;
                while(k2>1)
                {
                    t1=t1.next;
                    k2--;
                }
                cur.next=t1;
            }
            temp=nextnext;

            // if(iter==0)
            //     break;
            // prev=cur;
        }
        return newHead;

    }
}