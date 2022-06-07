/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node r =head;
        
        while(r!=null){
            // Node temp = r.next;
            Node n = new Node(r.val);
            n.next = r.next;
            r.next=n;
            
            // r.next = n;
            // n.next = temp;
            r = n.next;
        }
        r= head;
        
        while(r!=null){
            if(r.random==null){
                r.next.random=null;
            }
            else{
            r.next.random=r.random.next;
            }

            r=r.next.next;
        }
        
        Node dumy = new Node(-1);
        Node r2 = dumy;
         r =head;
        while(r!=null){
            Node temp = r.next.next;
            r2.next=r.next;
            // r.next = temp;
            // r=temp;
            r.next = r.next.next;
            r = temp;
            r2=r2.next;
            
            
            
        }
    
        // r2.next=null;
        
        
        return dumy.next;
        
    }
}
