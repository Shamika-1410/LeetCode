class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int a[] = new int[n/2];
        int b[] = new int[n/2];
        int ai=0,bi=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=0){
                a[ai++]=nums[i];
            }else{
                b[bi++]=nums[i];
            }
        }
        ai=0;bi=0;
        int i=0;
        while(bi<n/2 && ai<n/2 && i<n){
            nums[i++]=b[bi++];
            if(i<n)nums[i++]=a[ai++];
        }
        return nums;
    }
}