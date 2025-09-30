class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0,j = 0;
        int count = 0;
        while(i<n && j<n){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
                count++;
            }
            j++;
        }
        return count;
    }
}