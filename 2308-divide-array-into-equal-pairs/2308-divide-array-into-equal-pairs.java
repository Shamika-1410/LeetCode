class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        if(n%2!=0) return false;
        boolean ans = true;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()%2!=0) return false;
        }
        return true;
    }
}