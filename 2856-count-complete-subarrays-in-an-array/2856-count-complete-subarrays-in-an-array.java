class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int left = 0;
        int ans = 0;
        int k = getDistinct(nums);
        for (int right = 0; right < n; right++) {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()==k){
                ans+=n-right;
                if(map.get(nums[left])>1){
                    map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                }else{
                    map.remove(nums[left]);
                }
                left++;
            }
        }
    
        return ans;
    }
    public static int getDistinct(int nums[]){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return set.size();
    }
}