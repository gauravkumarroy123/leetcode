class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result=new ListNode(0);
    ListNode ans=result;
    int carry=0;
    while(l1!=null || l2!=null || carry!=0){
        int sum=0+carry;
        if(l1!=null){
            sum +=l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            sum+=l2.val;
            l2=l2.next;
        }
        carry=sum/10;
        sum=sum%10;
        ans.next=new ListNode(sum);
        ans=ans.next;
    }
    return result.next;
    }
}