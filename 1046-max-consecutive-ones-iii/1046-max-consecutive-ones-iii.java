class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int left = 0;
        int freqZero = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]==0)freqZero++;
            while(freqZero>k){
                if(nums[left]==0)freqZero--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}