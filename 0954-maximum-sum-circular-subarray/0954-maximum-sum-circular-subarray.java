class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int suffsum = nums[n-1];
        int[] rightmax = new int[n];
        rightmax[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffsum += nums[i];
            rightmax[i]=Math.max(suffsum,rightmax[i+1]);
        }
        int maxSum = nums[0];
        int specialSum = nums[0];
        int curMax = 0;
        for (int i = 0, prefixSum = 0; i < n; ++i) {
            curMax = Math.max(curMax, 0) + nums[i];
            maxSum = Math.max(maxSum, curMax);

            prefixSum += nums[i];
            if (i + 1 < n) {
                specialSum = Math.max(specialSum, prefixSum + rightmax[i + 1]);
            }
        }
        return Math.max(maxSum, specialSum);  
    }
}