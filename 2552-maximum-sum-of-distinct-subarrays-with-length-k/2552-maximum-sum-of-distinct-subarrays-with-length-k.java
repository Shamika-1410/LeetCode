class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        long sum = 0;
        long maxSum = 0;
        int l = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r=0;r<arr.length;r++){
            int last = map.getOrDefault(arr[r],-1);
            while(l<=last || r-l+1>k){
                sum-=arr[l];
                l++;
            }
            map.put(arr[r],r);
            sum+=arr[r];
            if(r-l+1==k)maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}