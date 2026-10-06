class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode ans=new ListNode(0);
     ListNode curr=ans;
     while(list1!=null && list2!=null){
        if(list1.val>list2.val){
            curr.next=list2;
            list2=list2.next;
        }
        else{
            curr.next=list1;
            list1=list1.next;
        }
        curr=curr.next;
     }
     if(list1!=null)
        curr.next=list1;
        else
        curr.next=list2;
     return ans.next;
    }
}