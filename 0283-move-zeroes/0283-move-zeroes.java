class Solution {
    public void moveZeroes(int[] nums) {
        int cnt=0;
        int k=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt++;
            if(nums[i]==0 || set.contains(nums[i])){
                int index = nextNonZero(i,nums);
                if(index!=i && index<nums.length){
                    nums[i]=nums[index];
                    nums[index]=0;
                    k++;
                    set.add(nums[index]);
                }
            }
        }
    }
    public int nextNonZero(int k, int nums[]){
        int i=k;
        for(i=k;i<nums.length;i++){
            if(nums[i]!=0) return i;
        }
        return i;
    }
}