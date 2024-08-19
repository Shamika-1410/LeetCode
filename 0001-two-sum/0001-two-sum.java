class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(map.containsKey(target - a)){
                return new int[] { i , map.get(target - a)};
            }else{
                map.put(a,i);
            }
        }
        return new int[] {};
    }
}