class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int n = nums.length;
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum += nums[i];
            if(currSum>sum)sum = currSum;
            if(currSum<0)currSum = 0;
        }
        return sum;
    }
}