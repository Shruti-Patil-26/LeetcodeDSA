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
    public int getDecimalValue(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        n-=1;
        int num=0;
        temp=head;
        while(temp!=null)
        {
            num+=(temp.val*(Math.pow(2,n)));
            n--;
            temp=temp.next;
        }
        return num;
    }
}