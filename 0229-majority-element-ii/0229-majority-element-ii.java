class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> pair : map.entrySet()){
            if(pair.getValue()>n){
                ans.add(pair.getKey());
            }
        }
        return ans;
    }
}