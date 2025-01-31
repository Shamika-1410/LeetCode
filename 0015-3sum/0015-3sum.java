class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ansSet = new HashSet<>();
        
        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int t = -(nums[i]+nums[j]);
                if(set.contains(t)){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],t);
                    temp.sort(null);
                    ansSet.add(temp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(ansSet);
        return ans;
    }
}