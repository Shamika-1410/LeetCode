class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        int pivotFreq = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                pivotFreq++;
            }else if(nums[i]<pivot){
                small.add(nums[i]);
            }else{
                large.add(nums[i]);
            }
        }
        int k=0;
        int s = small.size();
        int l = large.size();
        for(int i=0;i<s;i++){
            nums[k++]=small.get(i);
        }
        for(int i=0;i<pivotFreq;i++){
            nums[k++]=pivot;
        }
        for(int i=0;i<l;i++){
            nums[k++]=large.get(i);
        }
        return nums;
    }
}