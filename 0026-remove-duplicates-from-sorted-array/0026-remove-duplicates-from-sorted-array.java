class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int ans[] = new int[set.size()];
        int i=0;
        for(Integer ele : set){
            nums[i++] = ele;
        }
        return ans.length;
    }
}