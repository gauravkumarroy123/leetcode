class Solution {
    public int maxDepth(String s) {
     int max=0;
     int curr=0;
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('){
            curr++;
            max=Math.max(curr,max);
        }
        if(c==')'){
            curr--;
            max=Math.max(curr,max);
        }
     } 
     return max;   
    }
}