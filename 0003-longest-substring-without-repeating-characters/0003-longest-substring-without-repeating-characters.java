class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0;
        int ans=0;
        //Set<Character> set = new HashSet<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            if(!map.containsKey(c) || map.get(c)<l){
                map.put(c,r);
                ans = Math.max(ans,r-l+1);
            }else{
                l=map.get(c)+1;
                map.put(c,r);
            }
        }
        return ans;
    }
}