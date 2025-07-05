class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high)/2;
        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high = mid-1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}