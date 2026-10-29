class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                if(nums[start]==0){
                    count--;
                }
                start++;
            }
            max=Math.max(max,i+1-start);
        }
        return max;
    }
}