class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int idx = 0;
        for(int i=0;i<n;i++){
            idx = Math.abs(nums[i]);
            if(nums[idx]<0)break;
            else nums[idx]=-1*nums[idx];
        }
        return idx;
    }
}