class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum=0,ans=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i]%2;
            if (map.containsKey(sum-k)) {
                ans+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}