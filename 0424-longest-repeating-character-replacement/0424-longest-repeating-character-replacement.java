class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int ans = 0;
        int left =0,maxFreq=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right=0;right<n;right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));
            while((right-left+1) - maxFreq > k){
                char l = s.charAt(left);
                map.put(l,map.get(l)-1);
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}