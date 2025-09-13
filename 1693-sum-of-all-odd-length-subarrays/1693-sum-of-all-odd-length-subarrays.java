class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
      int n = arr.length;
      int[] prefixSum = new int[n];
      prefixSum[0] = arr[0];
      for(int i=1;i<n;i++){
        prefixSum[i] = prefixSum[i-1] + arr[i];
      }
      int j = 1;
      int len = 1 + (j-1)*2;
      int finalSum = arr[0];
      while(len<n){
        for(int i=0;i<= n-len-1;i++){
            finalSum += prefixSum[i+len] - prefixSum[i];
        }
        j++;
        len = 1 + (j-1)*2;
        if(len<=n)finalSum += prefixSum[len-1];
      }
      return finalSum;  
    }
}