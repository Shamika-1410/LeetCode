class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int ans = nums[0];
        for(Map.Entry<Integer,Integer> pair : map.entrySet()){
            if(pair.getValue()>n){
                ans = pair.getKey();
                break;
            }
        }
        return ans;
    }
}