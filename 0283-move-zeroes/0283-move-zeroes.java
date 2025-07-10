class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++] = nums[i];
            }
        }
        for(int i=idx;i<nums.length;i++){
            nums[i]=0;
        }
    }
}