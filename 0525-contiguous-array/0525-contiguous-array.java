class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int n = nums.length;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            count += (nums[i]==1?1:-1);
            if(map.containsKey(count)){
                max = Math.max(max, i - map.get(count));
            }else{
                map.put(count, i);
            }
        }
        return max;
    }
}