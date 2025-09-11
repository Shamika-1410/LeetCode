class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        long pC = 0;
        long ans = 0;
        int left = 0;
        for(int right = 0; right<n; right++){
            int count = map.getOrDefault(nums[right],0);
            pC += count;
            map.put(nums[right], count+1);
            while(pC >= k){
                ans += n - right;
                pC -= (map.get(nums[left]) - 1);
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
        }
        return ans;
    }
}