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
    public void reorderList(ListNode head) {
        if(head.next==null)
            return ;
        ArrayList<ListNode> arr=new ArrayList();
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp);
            temp=temp.next;
        }
        int n=arr.size();
        ListNode cur=head,last=head;

        for(int i=0;i<n/2;i++)
        {
             cur=arr.get(i);
             last=arr.get(n-1-i);
            cur.next=last;
            last.next=arr.get(i+1);
        }
        if(n%2==1)
        {
            last.next.next=null;
        }
        else
        {
            last.next=null;
        }
        
    }
}