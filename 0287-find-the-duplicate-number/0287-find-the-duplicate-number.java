class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int t = 0;
        for(int i=0;i<n;i++){
            t = nums[i];
            if(ans[t]==-1){
                break;
            }else{
                ans[t]=-1;
            }
        }
        return t;
    }
}