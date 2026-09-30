class Solution {
    public boolean isPalindrome(ListNode head) {
    if(head!=null && head.next==null){
        return true;
    }
     ListNode first=head;
     ListNode second =head;
     while(second!=null && second.next!=null){
        first=first.next;
        second=second.next.next;
     }   
       if(second!=null){
        first=first.next;
       }
       ListNode last=null;
       while(first!=null){
        ListNode save=first.next;
        first.next=last;
        last=first;
        first=save;
       }
       ListNode curr=head;
       while(last!=null){
       if(curr.val!=last.val){
        return false;
       }
       last=last.next;
       curr=curr.next;
       }
       return true;
    }
}