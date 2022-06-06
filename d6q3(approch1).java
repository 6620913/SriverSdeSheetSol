//-----------------My first working approach-------------------------------------------------------
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
        
        
        if(k>s){
            return head;
        }
        
        if(k==s){
            return reverse(head);
        }
        
       ListNode[] store = new ListNode[s/k+1];
        
        ListNode rem=head;
        for(int i=0;i<s/k;i++){
            ListNode[] t = krem(rem,k);
            store[i]=t[0];
            rem=t[1];
            store[store.length-1]=rem;
            
        }
        
        
        ListNode run=store[0];
        for(int i =1;i<store.length;i++){
            
            while(run.next!=null){
                run = run.next;
                
            }
            run.next=store[i];
        }
        return store[0];
        
        
        
        
    }
    
    public ListNode reverse(ListNode head){
        
        ListNode r =head;
        ListNode prev = null;
        
        while(r!=null){
            ListNode temp = r.next;
            r.next=prev;
            prev=r;
            r=temp;
            
            
        }
        return prev;
        
        
        
        
    }
    
    public ListNode[] krem(ListNode head,int k){
        
        int c =0;
        ListNode r=head;
        
        while(r!=null&& c!=k-1){
           c++;
            
        r=r.next;
            
        }
        ListNode rem = r.next;
        r.next=null;
        head =reverse(head);
        
        ListNode[] res = new ListNode[2];
        res[0]=head;
        res[1]=rem;
        
        return res;
        
        
    }
    
    
    
}
