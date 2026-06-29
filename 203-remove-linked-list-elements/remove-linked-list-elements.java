
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode main = new  ListNode(0);
        main.next = head;
        ListNode curr = main;

    while(curr.next != null){
        if(curr.next.val == val){
            curr.next = curr.next.next;
        }
        else{
            curr=curr.next;
        }
    }
    return main.next;
    }
}

        
    
