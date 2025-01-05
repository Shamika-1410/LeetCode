class Solution {
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum>ans)ans=sum;
            if(sum<0) sum=0;
        }
        return ans;
    }
}