class Solution {
    public int minimumDeletions(String word, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int n = word.length();
        for(int i=0;i<n;i++){
            char c = word.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans = n;
        for (int a : map.values()) {
            int deleted = 0;
            for (int b : map.values()) {
                if(b<a){
                    deleted+=b;
                }else if(b>a+k){
                    deleted+=b-a-k;
                }
            }
            ans = Math.min(ans,deleted);
        }
        return ans;
    }
}