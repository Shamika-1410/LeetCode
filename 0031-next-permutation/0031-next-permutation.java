class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length; // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find the next greater element
        //         and swap it with nums[ind]:
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                // Swap nums[i] and nums[ind]
                int tmp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = tmp;
                break;
            }
        }

        // Step 3: Reverse the right half:
        reverse(nums, ind + 1, n - 1);

        return;
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}