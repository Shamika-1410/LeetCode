class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int maxlen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            if(map.size()<=2)maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}