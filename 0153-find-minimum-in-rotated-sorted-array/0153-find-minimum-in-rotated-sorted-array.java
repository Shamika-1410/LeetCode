class Solution {
    public int findMin(int[] arr) {
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high)/2;
        while(low <= high){
            mid = (low + high)/2;
            if(arr[low]<=arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}