class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int i=0,j=n-1;
        int left = 1,right =1;
        int ans = Integer.MIN_VALUE;
        while(i<n && j>=0){
            if(left==0)left = 1;
            if(right==0)right = 1;
            left *= arr[i];
            right *= arr[j];
            ans = Math.max(ans,Math.max(left,right));
            i++;
            j--;
        }
        return ans;
    }
}