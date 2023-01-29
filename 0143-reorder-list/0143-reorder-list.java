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
    public ListNode reverse2nd(ListNode head){
        ListNode curr=head.next,prev=null;
        head.next=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode findMid(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        //find midNode
        ListNode midNode=findMid(head);
        //reverse 2nd Half
        ListNode left=head;
        ListNode right=reverse2nd(midNode);
        //zigzag merge
        ListNode nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }
}