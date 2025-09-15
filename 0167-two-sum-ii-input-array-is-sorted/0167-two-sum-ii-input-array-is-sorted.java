class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]) + 1;
                ans[1] = i + 1;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}