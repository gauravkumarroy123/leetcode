class Solution {
    public String longestPalindrome(String s) {
    String ans="";
    int h=s.length();
    for(int i=0;i<h;i++){
        for(int j=i;j<h;j++){
            String str=s.substring(i,j+1);
            if(ispalindrome(str)){
              if(str.length()>ans.length()){
                ans=str;
              }
            }
        }
    }
     return ans;
    }
    public boolean ispalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;;
            right--;
        }
     return true;
    }
}