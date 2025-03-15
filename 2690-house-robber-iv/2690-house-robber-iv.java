class Solution {
    public int minCapability(int[] nums, int k) {
        int start = 1;
        int end = 0;
        for(int num:nums) {
            end = Math.max(end, num);
        }
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(!helper(nums, k, mid)) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return start;
    }
    private boolean helper(int[] nums, int k, int cap) {
        for(int i=0;i<nums.length;i++) {
            if(cap>=nums[i]) {
                k--;
                i++;
            }
            if(k<=0) {
                return true;
            }
        }
        return false;
    }
}
