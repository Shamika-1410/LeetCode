class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int a=0;
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                a=i;
                break;
            }
        }
        return a;
    }
}