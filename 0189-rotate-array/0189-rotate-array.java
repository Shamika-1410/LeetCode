class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1 || k == nums.length){
            return; // no need to do anything
        }else if(nums.length < k){
            k = k % nums.length;
        }
        int n=nums.length;
        int[] newNum = new int[n];
        int j=n-k;
        for(int i=0;i<k && j<n;i++){
            newNum[i]=nums[j++];
        }
        j=0;
        for(int i=k;i<n && j<n-k;i++){
            newNum[i]=nums[j++];
        }
        for(int i=0;i<n;i++){
            nums[i]=newNum[i];
        }
    }
}