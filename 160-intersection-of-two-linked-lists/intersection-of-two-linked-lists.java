/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> list1=new ArrayList();
        ListNode  temp=headA;
        while(temp!=null){
             list1.add(temp);
             temp=temp.next;  
        }
        temp=headB;
      
        while(temp!=null)
        {
            if(list1.contains(temp))
                return temp;
            temp=temp.next;
            
            
        }
        return null;
    }
}