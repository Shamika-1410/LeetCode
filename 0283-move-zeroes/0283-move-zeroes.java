class Solution {
    public void moveZeroes(int[] nums) {
        int a=0;
        for(int i : nums){
            if(i!=0){
                nums[a]=i;
                a++;
            }
        }
        for(int i = a;i<nums.length;i++){
            nums[i]=0;
        }
    }
}