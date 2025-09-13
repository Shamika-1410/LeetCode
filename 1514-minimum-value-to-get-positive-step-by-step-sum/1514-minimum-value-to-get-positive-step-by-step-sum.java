class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0]=nums[0];
        int min = prefixSum[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
            min = Math.min(min, prefixSum[i]);
        }
        if(min>=0){
            return 1;
        }
        return Math.abs(min)+1;
    }
}