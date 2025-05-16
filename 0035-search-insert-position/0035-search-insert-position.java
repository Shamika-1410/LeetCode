class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ans=i;
                break;
            }
        }
        if(ans!=-1)return ans;
        if(target<nums[0])return 0;
        else if(target>nums[n-1])return n;
        for(int i=0;i<n-1;i++){
            if(target>nums[i] && target<nums[i+1]){
                ans = i+1;
                break;
            }
        }
        return ans;
    }
}