class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int cnt = 0;
        int maxlen = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)cnt++;
            while(cnt>k){
                if(nums[left++]==0)cnt--;
            }
            if(cnt<=k){
                int len = right-left+1;
                maxlen= Math.max(len,maxlen);
            }
        }
        return maxlen; 
    }
}