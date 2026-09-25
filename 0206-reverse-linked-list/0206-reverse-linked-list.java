class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode prev=null;
    ListNode first=head;
    while(first!=null){
        ListNode second=first.next;
        first.next=prev;
        prev=first;
        first=second;
    }  
    return prev;  
    }
}