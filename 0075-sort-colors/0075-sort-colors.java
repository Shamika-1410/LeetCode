class Solution {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0,mid = 0, high = n -1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,low,nums);
                low++;
                mid++;
            }else if(nums[mid]==2){
                swap(mid,high,nums);
                high--;
            }else{
                mid++;
            }
        }
    }
    private static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}