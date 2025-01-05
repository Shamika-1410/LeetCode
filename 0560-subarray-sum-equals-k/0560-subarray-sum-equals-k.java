class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum =0, ans =0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int r = prefixSum-k;
            ans += map.getOrDefault(r,0);
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return ans;
    }
}