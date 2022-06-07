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
        
        
        int s =0;
        ListNode r = head;
        while(r!=null){
            
            
            s++;
            r=r.next;
        }
        
        if(s==0||s==1||s==k||k%s==0){
            return head;
        }
        
        
        
        r=head;
        k=k%(s);
        int  c=0;
        while(r!=null){
            c++;
            if(c==s-k){
                break;
            }
            r=r.next;
        }
        ListNode temp = r.next;
        r.next=null;
        ListNode j = head;
        head=temp;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        temp.next=j;
        
        
        return head;
        
    }
}
