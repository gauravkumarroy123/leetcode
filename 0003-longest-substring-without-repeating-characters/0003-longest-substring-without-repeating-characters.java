class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashSet<Character>set=new HashSet<>();
    int len=0;
    int left=0;
    for(int right=0;right<s.length();right++){
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        int maxlen=right-left+1;
        len= Math.max(maxlen,len);
    }    
    return len;
    }
}