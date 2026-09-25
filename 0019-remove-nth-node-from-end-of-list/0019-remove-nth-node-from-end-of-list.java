class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode ans =new ListNode(0);
     ans.next=head;
     ListNode first=ans;
     ListNode second =ans;
     for(int i=0;i<n;i++){
        second=second.next;
     }
     while(second.next!=null){
        first=first.next;
        second=second.next;
     }
     first.next=first.next.next;
     return ans.next;

    }
}