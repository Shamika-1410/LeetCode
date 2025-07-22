class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0,right=0,ans=0,sum=0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        while(left<n && right<n){
            if(!set.contains(nums[right])){
                sum+=nums[right];
                ans=Math.max(sum,ans);
                set.add(nums[right]);
                right++;
            }else{
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return ans;
    }
}