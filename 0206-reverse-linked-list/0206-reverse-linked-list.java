
class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode current = head, prev =null;
      ListNode next;
      while(current !=null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        }
        return prev;
}
 
}