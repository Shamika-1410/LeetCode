class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                int j = map.get(target-nums[i]);
                if(i!=j){
                    ans[0]=i;ans[1]=j;
                    break;
                }
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}