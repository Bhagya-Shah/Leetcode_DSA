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
        ListNode l3=new ListNode(0);
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode t3=l3;
        int t=0;
        while(t1!=null && t2!=null){
            int a=t1.val+t2.val+t;
            if(a>9){
               t=1; 
            }else{
                t=0;
            }
            t3.next=new ListNode(a%10);
            t3=t3.next;
            t1=t1.next;
            t2=t2.next;
        }
        while(t1!=null){
            int a=t1.val+t;
            if(a>9){
                t=1;
            }else{
                t=0;
            }
            t3.next=new ListNode(a%10);
            t3=t3.next;
            t1=t1.next;
        }
        while(t2!=null){
            int a=t2.val+t;
            if(a>9){
                t=1;
            }else{
                t=0;
            }
            t3.next=new ListNode(a%10);
            t3=t3.next;
            t2=t2.next;
        }
        if(t==1){
            t3.next=new ListNode(1);
        }
        return l3.next;
    }
}