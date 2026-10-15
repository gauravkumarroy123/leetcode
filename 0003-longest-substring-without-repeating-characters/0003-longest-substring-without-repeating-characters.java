class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character>ans=new HashSet<>();
    int n=s.length();
    int start=0;
    int max=0;
    for(int i=0;i<n;i++){
    while(ans.contains(s.charAt(i))){
    ans.remove(s.charAt(start));
    start++; 
    }   
    ans.add(s.charAt(i)); 
    max=Math.max(max,i+1-start);
    }
    return max;
    }
}