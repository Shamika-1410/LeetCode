class Solution {
    public boolean check(int[] nums) {
        int prev = nums[0];
        int ans=0;
        int idx=0;
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];
            if(curr<prev){
                ans++;
                idx=i;
            }
            prev = curr;
        }
        if(ans==0) return true;
        else if(ans==1){
            if(nums[0]>=nums[nums.length-1]) return true;
        }
        return false;
    }
}