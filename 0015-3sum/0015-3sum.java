class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int l = i + 1,r = n - 1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<n-1 && nums[l]==nums[l+1]) l++;
                    while(r>0 && nums[r]==nums[r-1]) r--;
                    l++;r--;
                }else if(sum<0)l++;
                else r--;
            }
        }
        return ans;
    }
}