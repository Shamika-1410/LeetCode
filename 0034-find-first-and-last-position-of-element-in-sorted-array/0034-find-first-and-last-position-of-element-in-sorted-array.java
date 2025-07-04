class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0]=lower(nums,target);
        ans[1]=upper(nums,target);
        return ans;
    }
    public static int lower(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        int mid = (low + high)/2;
        while(low<=high){
            mid = (low + high)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int upper(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        int mid = (low + high)/2;
        while(low <= high){
            mid = (low + high)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}