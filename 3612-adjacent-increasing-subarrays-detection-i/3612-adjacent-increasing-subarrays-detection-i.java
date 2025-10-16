class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int i = 0;
        int n = nums.size();
        while(i+2*k<=n){
            List<Integer> l1 = nums.subList(i, i + k);
            List<Integer> l2 = nums.subList(i + k, i + 2 * k);
            if (isStrictlyIncreasing(l1) && isStrictlyIncreasing(l2)) {
                return true;
            }
            i++;
        }
        return false;
    }
    private boolean isStrictlyIncreasing(List<Integer> sub) {
        for (int j = 0; j < sub.size() - 1; j++) {
            if (sub.get(j) >= sub.get(j + 1)) {
                return false;
            }
        }
        return true;
    }
}