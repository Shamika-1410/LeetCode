class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
        int startValue = 1;
        while(true){
            int i = 0;
            for(i=0;i<n;i++){
                int currSum = startValue + prefixSum[i];
                if(currSum<1){
                    break;
                }
            }
            if(i==n){
                break;
            }
            startValue++;
        }
        return startValue;
    }
}