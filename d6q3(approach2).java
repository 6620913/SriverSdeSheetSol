//-------------------------------My secound working approach--------------------------------


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
        
        
        
        int s =0;
        ListNode r = head;
        
        while(r!=null){
            s++;
            r=r.next;
        }
        
        
        if(s==1||s==0){
            return head;
        }
        
        
        ListNode t1=head;
        ListNode t2=head;
        
        ListNode curr = head;
        ListNode prev = null;
        int c=0;
        ListNode ans=head;
        while(s>=k){
            t1 = curr;
            prev=null;
            for(int i=0;i<k;i++){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                
                
            }
            if(c==0){
                c++;
                ans = prev;
            }else{
            t2.next=prev
                ;
                }
            t2=t1;
            s=s-k;
            
            
            
            
            
            
            
            
        }
        
        if(s>0){
            t2.next=curr;
        }
        
        return ans;
        
        
        
    }
}
